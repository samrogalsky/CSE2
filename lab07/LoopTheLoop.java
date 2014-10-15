//Samuel Rogalsky
//October 10, 2014
//CSE 02
//Lab 07
//Loop The Loop Java Program - displays stars according to user enterd int

import java.util.Scanner;//import scanner to accept input

public class LoopTheLoop{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        boolean answer = true;
        while(answer == true){
        System.out.print("Enter an int between 1 and 15- ");    
        if (myScanner.hasNextInt()){
            int nStars = myScanner.nextInt();
            if (nStars > 0 && nStars < 10){
                for (int counter = 0; counter < nStars; counter++){
                    System.out.print("*");
                }
                for (int counter = 0; counter <= nStars; counter++){
                    for (int j = 0; j < counter; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                
            
            }
            else{
                System.out.println("Your int was not in the range [1.15]");

            }
           
            
        }
        else{
            System.out.println("You did not enter an int");
        }
        System.out.print("Enter y or Y to go again- ");
        String letter = myScanner.next();
        if(letter.equals("Y") || letter.equals("y")){
            answer = true;
        }
        else{
            break;
        }
        }
        
    }
}