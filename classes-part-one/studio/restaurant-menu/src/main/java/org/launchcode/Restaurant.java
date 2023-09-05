package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {



        ArrayList<MenuItem> myMenuItems = new ArrayList<>();

        MenuItem omelette = new MenuItem("omelette", 8.00, "a mouth-watering fluffy cloud of egg and cheese", "main course", true);
        MenuItem charcuterie = new MenuItem("charcuterie board", 15.00, "a selection of local cheeses, pickled fruits and veg, and various crackers and breads", "appetizer",  true);
        MenuItem sorbet = new MenuItem("apricot sorbet", 12.00, "light, airy, and refreshing frozen apricot sorbet", "dessert", true);
        MenuItem steakFrites = new MenuItem("steak frites", 27.00, "a slab of cow and accompanying fries, your choice of sauce", "main course", true);



        Menu myMenu = new Menu("Sassafras", LocalDate.now(), myMenuItems);

        myMenu.addItem(omelette);
        myMenu.addItem(charcuterie);
        myMenu.addItem(sorbet);
        myMenu.addItem(steakFrites);
        System.out.println(myMenu);

        System.out.println(steakFrites);

        myMenuItems.remove(omelette);

        System.out.println(myMenu);

        MenuItem newSteakFrites = new MenuItem("steak frites", 8.00, "a mouth-watering fluffy cloud of egg and cheese", "main course", true);

        myMenu.addItem(newSteakFrites);

        System.out.println(myMenu);





    }


}
