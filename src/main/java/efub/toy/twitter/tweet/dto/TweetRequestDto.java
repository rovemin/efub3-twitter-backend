package efub.toy.twitter.tweet.dto;

import lombok.Getter;

@Getter
public class TweetRequestDto {
    private Long accountId;
    private String content;
}
