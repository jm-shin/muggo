package kr.co.dayday.muggo.domain;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    Review save(Review review);
}
