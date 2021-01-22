package org.wecancodeit;

/*Part 1
Ask the user for the user’s first name.
Ask the user for the user’s last name.
Ask the user for the user’s age.
Ask the user for the user’s birth month (as an 'int').
Ask the user for the user’s favorite ROYGBIV color.

If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
Ask the user for the user's number of siblings.
*/

import java.util.Scanner;

public class FortuneTellerApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to WCCI's Fortune Teller!");

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = inputScanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = inputScanner.nextLine();

        System.out.println("What is your age?");
        int age = inputScanner.nextInt();

        System.out.println("What month were you born in? (Numerical value please!)");
        int birthMonth = inputScanner.nextInt();
        inputScanner.nextLine();


        System.out.println("What is your favorite ROYGBIV color? Enter \'Help\' to get a list of ROYGBIV colors");
        String favoriteColor = inputScanner.nextLine();

        while (favoriteColor.equals("Help")) {
            System.out.println("The ROYGBIV Colors are: Red, Orange, Yellow, Green, Blue, Indigo, Violet\n" +
                    "What is your favorite ROYGBIV color? Enter \'Help\' to get a list of ROYGBIV colors");
            favoriteColor = inputScanner.nextLine();
        }

        System.out.println("What is your sibling count?");
        int siblingCount = inputScanner.nextInt();

        int retirementYears = 0;

        if (age % 2 == 1) {
            retirementYears = 14;
        } else {
            retirementYears = 12;
        }

        String vacationHomeLocation = "";

        if (siblingCount == 0) {
            vacationHomeLocation = "Boco Raton, FL";
        } else if (siblingCount == 1) {
            vacationHomeLocation = "Nassau, Bahamas";
        } else if (siblingCount == 2) {
            vacationHomeLocation = "Ponta Negro, Brazil";
        } else if (siblingCount == 3) {
            vacationHomeLocation = "Portland, OR";
        } else if (siblingCount > 3) {
            vacationHomeLocation = "Baton Rouge, LA";
        } else if (siblingCount < 0) {
            vacationHomeLocation = "Chernobyl, Ukraine";
        }

        String modeOfTransportation;
        switch (favoriteColor.toLowerCase()) {
            case "red":
                modeOfTransportation = "Maserati";
                break;
            case "orange":
                modeOfTransportation = "stallion";
                break;
            case "yellow":
                modeOfTransportation = "chariot";
                break;
            case "green":
                modeOfTransportation = "taxi";
                break;
            case "blue":
                modeOfTransportation = "rickshaw";
                break;
            case "indigo":
                modeOfTransportation = "motor scooter";
                break;
            case "violet":
                modeOfTransportation = "flying saucer";
                break;
            default:
                modeOfTransportation = "Yugo";
        }

        double bankBalance = 0;
        if (birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 256000.23;
        } else if (birthMonth >= 5 && birthMonth <= 8) {
            bankBalance = 3687105.42;
        } else if (birthMonth >= 9 && birthMonth <= 12) {
            bankBalance = 86.23;
        }

        System.out.println(firstName + " " + lastName +
                " will retire in " + retirementYears + " years " +
                " with $" + bankBalance + " in the bank," +
                " a vacation home in " + vacationHomeLocation + "," +
                " and travel by " + modeOfTransportation + ".");
    }
}
