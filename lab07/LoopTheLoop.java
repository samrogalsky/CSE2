//Samuel Rogalsky
//October 10, 2014
//CSE 02
//Lab 07
//Loop The Loop Java Program - displays stars in accordance to user enterd int

import java.util.Scanner; //import scanner to accept input

public class LoopTheLoop { //define public class

    public static void main(String[] args) { //define main method

        Scanner myScanner;
        myScanner = new Scanner(System.in); 
        boolean answer = true;
        while (answer == true) {//this will run forever until break 
            System.out.print("Enter an int between 1 and 15- ");
            if (myScanner.hasNextInt()) {//if scanner is an int continue, else
                int nStars = myScanner.nextInt();
                if (nStars > 0 && nStars < 16) {//if nStars is in that range, else
                    for (int counter = 0; counter < nStars; counter++) {//loop that prints the first line of stars
                        System.out.print("*");
                    }
                    for (int counter = 0; counter <= nStars; counter++) {//loop that prints the triangle of stars
                        for (int j = 0; j < counter; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                else {//else if it is not in the range
                    System.out.println("Your int was not in the range [1.15]");
                }
            }
            else {//else if it is not an int
                System.out.println("You did not enter an int");
            }
            System.out.print("Enter y or Y to go again- ");
            String letter = myScanner.next();
            if (letter.equals("Y") || letter.equals("y")) {//if the user enters y, else
                answer = true;
            }
            else {//else for if the user doesnt enter a y
                break;
            }
        }

    }
}