package kr.co.dayday.muggo.application;

import kr.co.dayday.muggo.domain.MenuItem;
import kr.co.dayday.muggo.domain.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {


    private MenuItemRepository menuItemRepository;

    @Autowired
    public MenuItemService(MenuItemRepository menuItemRepository){
        this.menuItemRepository = menuItemRepository;
    }

    public void bulkUpdate(Long restaurantsId, List<MenuItem> menuItems){
        for(MenuItem menuItem : menuItems){
            update(restaurantsId, menuItem);
        }

    }

    private void update(Long restaurantsId, MenuItem menuItem) {
        if(menuItem.isDestroy()){
            //TODO : delete
            menuItemRepository.deleteById(menuItem.getId());
            return;
        }
        menuItem.setRestaurantId(restaurantsId);
        menuItemRepository.save(menuItem);
    }

}
