package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your circle's radius?");
                    double radius = input.nextDouble();
            double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        input.close();

//        if (input.hasNextDouble() && input.nextDouble() > 0) {
//            double radius = input.nextDouble();
//            double area = Circle.getArea(radius);
//            System.out.println("The area of a circle of radius " + radius + " is: " + area);
//        } else {
//            System.out.println("Please enter positive numbers only!");


        }

    }

