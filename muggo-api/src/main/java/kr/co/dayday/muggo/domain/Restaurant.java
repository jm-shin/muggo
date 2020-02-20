package kr.co.dayday.muggo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final Long id;
    private final String name;
    private final String address;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }

    public String getInformation() {
        return name+ " in "+address;
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems){
            addMenuItem(menuItem);
        }
    }
}
