package efub.toy.twitter.account.controller;

import efub.toy.twitter.account.domain.Account;
import efub.toy.twitter.account.dto.AccountResponseDto;
import efub.toy.twitter.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    // 계정 조회
    @GetMapping("/{accountId}")
    @ResponseStatus(value = HttpStatus.OK)
    public AccountResponseDto getAccount(@PathVariable Long accountId) {
        Account findAccount = accountService.findAccountById(accountId);
        return new AccountResponseDto(findAccount);
    }
}
