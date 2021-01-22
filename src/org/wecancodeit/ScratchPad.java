package org.wecancodeit;

import java.util.Scanner;

public class ScratchPad {

    public static void main(String[] args) {
        int number = 73;
        Scanner input = new Scanner(System.in);

        int guessedNumber;
        int guessCount = 0;
        do{
            System.out.println("Guess a number!");
            guessedNumber = input.nextInt();
            guessCount++;
        }while(number != guessedNumber && guessCount<3);
        if(number== guessedNumber){
            System.out.println("You guessed the number!");
        }else {
            System.out.println("You ran out of guesses");
        }

        //
//        System.out.println("What is you message?");
//        String message = input.nextLine();
//
//        int count = 1;
//        while(count<=5){
//            System.out.println(message);
//            count++;
//       }
    }


}
