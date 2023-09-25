package org.launchcode;

public class Main {
    public static void main(String[] args) {
        BaseDisc cd = new CD("Fan Mail", 750, "TLC");
        BaseDisc dvd = new DVD("Gladiator", 1500, "Action");


//        System.out.println(dvd.getBasicInfo());
//
//        System.out.println(cd.writeData("Don't go chasing waterfalls."));
//        System.out.println(dvd.writeData("Are you not entertained?"));

        CD newCD = (CD) cd;
        newCD.spinDisc();
        System.out.println(newCD.getBasicInfo());
        newCD.playSong();

        }
}