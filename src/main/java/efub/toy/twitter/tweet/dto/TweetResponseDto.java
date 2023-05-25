package efub.toy.twitter.tweet.dto;

import efub.toy.twitter.tweet.domain.Tweet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TweetResponseDto {
    private Long tweetId;
    private String userId;
    private String content;
    private LocalDateTime createdDate;

    public TweetResponseDto(Tweet tweet) {
        this.tweetId = tweet.getTweetId();
        this.userId = tweet.getWriter().getUserId();
        this.content = tweet.getContent();
        this.createdDate = tweet.getCreatedDate();
    }
}
