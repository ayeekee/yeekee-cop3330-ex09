package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;
import java.lang.*;

public class App {
    static final int constant = 350;

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("What is the length of the ceiling in feet? ");
        String length = se.nextLine();
        int len = Integer.parseInt(length);

        System.out.print("What is the width of the ceiling in feet? ");
        String width = se.nextLine();
        int wid = Integer.parseInt(width);

        double area = len * wid;

        double gal = area / constant;

        System.out.println("You will need to purchase " + String.format("%.0f", Math.ceil(gal)) + " gallons of paint to cover " +  String.format("%.0f", area) + " square feet.");
    }
}
