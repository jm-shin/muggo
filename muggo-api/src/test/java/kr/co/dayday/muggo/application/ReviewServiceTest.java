package kr.co.dayday.muggo.application;

import kr.co.dayday.muggo.domain.Review;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewServiceTest {

    private ReviewService reviewService;

    @Before
    public void setUp(){
        reviewService = new ReviewService();
    }

    @Test
    public void addReview(){
        Review review = Review.builder()
                        .name("jongmin")
                        .score(3)
                        .description("masidda")
                        .build();

        reviewService.addReview(review);
    }
}