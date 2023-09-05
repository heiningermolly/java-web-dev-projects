package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private String restaurantName;
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(String name, LocalDate d, ArrayList<MenuItem> i) {
        this.restaurantName = name;
        this.lastUpdated = d;
        this.items = i;
    }


    public void addItem(MenuItem newItem) {
        if (items.contains(newItem)) {
            //throw new IllegalArgumentException("This item is already on the menu");
            System.out.println("The item [" + newItem.getName() + "] is already on the menu! Change it up, keep things fresh.");
        } else {
            this.items.add(newItem);
        }
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return
                restaurantName + '\n' + "Menu:\n" +
                "Courses\n" + items
                        +
                        "(seasonally updated and curated as of " + lastUpdated + ")";
    }
}
