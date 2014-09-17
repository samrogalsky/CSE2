//Samuel Rogalsky  
//September 14, 2014
//CSE 02
//Hw - 03
//Root java program

import java.util.Scanner;//imports scanner for user input

public class Root { //normal public class
    public static void main(String[] args) { //normal main method
    
        Scanner myScanner;//calls the scanner for user input
        myScanner = new Scanner(System.in);//assaignes the input to the user's keyboard
        
        System.out.print("Please enter a double and I will give you it's cube root: ");//text that requests the number of seconds
        double value = myScanner.nextInt();//assaignes the seconds input to the seconds variable
        double guess, answerGuess;//defines variables as doubles
        
        guess=value/3;//divides the value entered by 3
        guess=(2*guess*guess*guess+value)/(3*guess*guess);//inserted in the formula provided to get the cube root
        guess=(2*guess*guess*guess+value)/(3*guess*guess);//copied 4 times to improve accuracy of the cubed root. guess keeps getting replaced everytime this fuction is completed
        guess=(2*guess*guess*guess+value)/(3*guess*guess);
        guess=(2*guess*guess*guess+value)/(3*guess*guess);
        guess=(2*guess*guess*guess+value)/(3*guess*guess);
        answerGuess=guess*guess*guess;//tests the answer my multiplying it 3 times
        
        System.out.println("The cube root is "+guess);//outputs the guess cubed root
        System.out.println(guess+" * "+guess+" * "+guess+" = "+answerGuess);//gives back the number that is the output cubed
        
    }
}