package efub.toy.twitter.account.dto;

import efub.toy.twitter.account.domain.Account;
import efub.toy.twitter.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountResponseDto {
    private Long accountId;
    private String userId;
    private String name;
    private String email;
    private LocalDateTime joinDate;

    @Builder
    public AccountResponseDto(@NotNull Account account) {
        this.accountId = account.getAccountId();
        this.userId = account.getUserId();
        this.name = account.getName();
        this.email = account.getEmail();
        this.joinDate = account.getJoinDate();
    }
}
