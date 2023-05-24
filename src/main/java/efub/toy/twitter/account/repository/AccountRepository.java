package efub.toy.twitter.account.repository;

import efub.toy.twitter.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
