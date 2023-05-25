package efub.toy.twitter.tweet.controller;

import efub.toy.twitter.tweet.domain.Tweet;
import efub.toy.twitter.tweet.dto.TweetRequestDto;
import efub.toy.twitter.tweet.dto.TweetResponseDto;
import efub.toy.twitter.tweet.service.TweetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tweets")
@RequiredArgsConstructor
public class TweetController {
    private final TweetService tweetService;

    // 트윗 작성
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public TweetResponseDto tweetAdd(@RequestBody TweetRequestDto requestDto) {
        Tweet tweet = tweetService.addTweet(requestDto);
        return new TweetResponseDto(tweet);
    }

    // 트윗 전체 조회

    // 트윗 1개 조회

    // 트윗 삭제

}
