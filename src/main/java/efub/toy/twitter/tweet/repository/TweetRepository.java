package efub.toy.twitter.tweet.repository;

import efub.toy.twitter.tweet.domain.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
