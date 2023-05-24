package efub.toy.twitter.account.domain;

import efub.toy.twitter.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Account extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", updatable = false)
    private Long accountId;

    @Column(name = "user_id", nullable = false, length = 80)
    private String userId;

    @Column(nullable = false, length = 16)
    private String name;

    @Column(nullable = false, length = 80)
    private String email;

    @Builder
    public Account(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
}
