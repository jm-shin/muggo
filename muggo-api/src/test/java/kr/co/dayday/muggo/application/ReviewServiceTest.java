package kr.co.dayday.muggo.application;

import kr.co.dayday.muggo.domain.Review;
import kr.co.dayday.muggo.domain.ReviewRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ReviewServiceTest {

    private ReviewService reviewService;

    @Mock
    private ReviewRepository reviewRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        //reviewService = new ReviewService();
    }

    @Test
    public void addReview(){
        Review review = Review.builder()
                        .name("jongmin")
                        .score(3)
                        .description("masidda")
                        .build();

        reviewService.addReview(review);


        verify(reviewRepository).save(any());

    }
}