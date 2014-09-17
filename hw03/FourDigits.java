//Samuel Rogalsky  
//September 14, 2014
//CSE 02
//Hw - 03
//Four Digits java program

import java.util.Scanner;//imports scanner for user input

public class FourDigits { //normal public class
    public static void main(String[] args) { //normal main method
    
        Scanner myScanner;//calls the scanner for user input
        myScanner = new Scanner(System.in);//assaignes the input to the user's keyboard
        
        System.out.print("Please enter a double and I will display the four digits to the right of the decimal point: ");//text that requests the number of seconds
        double number = myScanner.nextDouble();//assaignes the seconds input to the seconds variable
        
        int newNumber = (int)number;//type casts the number to an int to truncate the decimal
        double decimal=number-newNumber;//gets just the decimal 
        double bigNumber=decimal*10000;//multiplies the decimal by 10000 to get it to a whole number
        int finalNumber=(int)(bigNumber+0.5);//adds .5 to the number to round it up, then casts it to an int to truncate the remailing deciamls
        
        System.out.printf("The four digits are %04d \n", finalNumber);//prints the answer in a format of adding up to 4 zeros infront of the number
    }
}
        
        