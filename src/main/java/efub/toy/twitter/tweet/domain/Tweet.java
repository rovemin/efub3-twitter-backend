package efub.toy.twitter.tweet.domain;

import efub.toy.twitter.account.domain.Account;
import efub.toy.twitter.global.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Tweet extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tweet_id", updatable = false)
    private Long tweetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account writer;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Builder
    public Tweet(Account writer, String content) {
        this.writer = writer;
        this.content = content;
    }
}
