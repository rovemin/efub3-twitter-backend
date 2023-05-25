package efub.toy.twitter.tweet.dto;

import efub.toy.twitter.tweet.domain.Tweet;
import lombok.AccessLevel;
import lombok.Builder;
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

    public TweetResponseDto(Long tweetId, String userId, String content, LocalDateTime createdDate) {
        this.tweetId = tweetId;
        this.userId = userId;
        this.content = content;
        this.createdDate = createdDate;
    }

    public static TweetResponseDto from(Tweet tweet) {
        return new TweetResponseDto(
            tweet.getTweetId(),
            tweet.getWriter().getUserId(),
            tweet.getContent(),
            tweet.getCreatedDate()
        );
    }
}
