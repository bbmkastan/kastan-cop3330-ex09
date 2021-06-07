package base;

import  java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        final int feetPerGallon = 350;

        int length = myApp.getLength();
        int width = myApp.getWidth();
        int area = length * width;
        int gallonsNeeded = myApp.getGallonsNeeded(feetPerGallon, area);

        myApp.printOutput(area, gallonsNeeded);
    }

    public void printOutput(int area, int gallonsNeeded) {
        System.out.println("You will need to purchase " + gallonsNeeded +
                " gallons of paint to cover " + area + " square feet.");
    }

    private int getWidth() {
        System.out.println("Width: ");
        return in.nextInt();
    }

    public int getLength() {
        System.out.println("Length: ");
        return in.nextInt();
    }

    public int getGallonsNeeded(int feetPerGallon, int area) {
        int gallonsNeeded = area / feetPerGallon;
        if ((area % feetPerGallon) != 0) {
            gallonsNeeded++;
        }
        return gallonsNeeded;
    }
}