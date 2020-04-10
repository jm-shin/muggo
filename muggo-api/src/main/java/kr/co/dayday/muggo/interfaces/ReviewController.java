package kr.co.dayday.muggo.interfaces;

import kr.co.dayday.muggo.application.ReviewService;
import kr.co.dayday.muggo.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/restaurants/{restaurantId}/reviews")
    public ResponseEntity<?> create(@PathVariable("restaurantId") Long restaurantId,
                                    @Valid @RequestBody Review review)
            throws URISyntaxException {
        reviewService.addReview(review);

        String url = "/restaurants/"+restaurantId +
                "/reviews/"+review.getId();
        return ResponseEntity.created(new URI("/restaurants/1/reviews/1")).body("{}");
    }

}
