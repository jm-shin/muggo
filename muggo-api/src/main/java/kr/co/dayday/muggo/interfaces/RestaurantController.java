package kr.co.dayday.muggo.interfaces;

import kr.co.dayday.muggo.application.RestaurantService;
import kr.co.dayday.muggo.domain.MenuItem;
import kr.co.dayday.muggo.domain.MenuItemRepository;
import kr.co.dayday.muggo.domain.Restaurant;
import kr.co.dayday.muggo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;



    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        Restaurant restaurant = restaurantService.getRestaurant(id);
        return restaurant;
    }

}
