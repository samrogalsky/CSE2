//Samuel Rogalsky
//September 29, 2014
//CSE 02
//HW 05
//Burger King Java Program - Asks the user if they want a burger, fries, or a drink 

import java.util.Scanner;//import scanner to accept input

public class BurgerKing{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        System.out.println("Enter a letter to indicate a choice of");//prompts the user to enter a string equating to a choice of order
        System.out.println("  Burger (B or b)");//burger
        System.out.println("  Soda (S or s)");//soda
        System.out.print("  Fries (F or f) ");//fries
        
        String answer = myScanner.next();//assaigns input to variable
        
        if(answer.length() == 1){//if answer length equals 1, if not esle
            if(answer.equals("B") || answer.equals("b") || answer.equals("S") || answer.equals("s") || answer.equals("F") || answer.equals("f")){ //if answer equals one of those selected strings, if not else
                if(answer.equals("B") || answer.equals("b")){//if answer equals B or b, if not esle
                    System.out.println("Enter A or a for \"all the fixins\"");//asks user to enter string for choice of toppings, for all the fixins
                    System.out.println("  Enter C or c for cheese");//for cheese
                    System.out.print("  Enter N or n for none of the above- ");//for no toppings
                    
                    String answerB = myScanner.next();//assaignes entered value to string variable
                    
                    switch (answerB){//switch statement for that variable answerB
                        case "A":System.out.println("You ordered a burger with \"all of the fixins\"");//if the customer entered A, print statement
                                break;//ends case
                        case "a":System.out.println("You ordered a burger with \"all of the fixins\"");//if the customer entered a, print statement
                                break;//ends case
                        case "C":System.out.println("You ordered a burger with cheese");//if the customer entered C, print statement
                                break;//ends case
                        case "c":System.out.println("You ordered a burger with cheese");//if the customer entered c, print statement
                                break;//ends case
                        case "N":System.out.println("You ordered a burger nothing on it");//if the customer entered N, print statement
                                break;//ends case
                        case "n":System.out.println("You ordered a burger with nothing on it");//if the customer entered n, print statement
                                break;//ends case
                        default:System.out.println("You did not enter any of A, a, C, c, N, n");//if the customer did not enter a valid string
                                break;//ends case
                    }
                }
                else if(answer.equals("S") || answer.equals("s")){//if answer equals S or s, if not esle
                    System.out.println("Do you want Pepsi (p or P),");//asks user to enter string for choice of sode, for pepsi
                    System.out.print("  Coke (c or C), Sprite (s or S), or Mountain Dew (m or M)- ");//coke, sprite, mountian dew
                    
                    String answerS = myScanner.next();//assaignes entered value to string variable

                    switch (answerS){//switch statement for that variable answerS
                        case "p":System.out.println("You ordered a Pepsi");//if the customer entered p, print statement
                                break;//ends case
                        case "P":System.out.println("You ordered a Pepsi");//if the customer entered P, print statement
                                break;//ends case
                        case "c":System.out.println("You ordered a Coke");//if the customer entered c, print statement
                                break;//ends case
                        case "C":System.out.println("You ordered a Coke");//if the customer entered C, print statement
                                break;//ends case
                        case "s":System.out.println("You ordered a Sprite");//if the customer entered s, print statement
                                break;//ends case
                        case "S":System.out.println("You ordered a Sprite");//if the customer entered S, print statement
                                break;//ends case
                        case "m":System.out.println("You ordered a Mountain Dew");//if the customer entered m, print statement
                                break;//ends case
                        case "M":System.out.println("You ordered a Mountian Dew");//if the customer entered M, print statement
                                break;//ends case
                        default:System.out.println("You did not enter any of p, P, c, C, m, M");//if the customer did not enter a valid string
                                break;//ends case
                    }
                }
                else{
                    System.out.print("Do you want a large or small order of fries (l, L, s, or S)- ");//asks the user to enter string for choice of fry, large or small
                    
                    String answerF = myScanner.next();//assaignes entered value to string variable
                    
                    switch (answerF){//switch statement for that variable answerF
                        case "l":System.out.println("You ordered large fries");//if the customer entered l, print statement
                                break;//ends case
                        case "L": System.out.println("You ordered large fries");//if the customer entered L, print statement
                                break;//ends case
                        case "s": System.out.println("You ordered small fries");//if the customer entered s, print statement
                                break;//ends case
                        case "S": System.out.println("You ordered small fries");//if the customer entered S, print statement
                                break;//ends case
                        default: System.out.println("You did not enter any of l, L, s, S");//if the customer did not enter a valid string
                                break;//ends case
                    }
                }
            }
            else{
                System.out.println("You did not enter any of B, b, S, s, F, or f");//gives error message if they did not enter a valid int
                return;//ends program
            }
        }
        else{
            System.out.println("A single character expected");//gives an else if user does not enter a single character
            return;//ends program
        }
    
    }
}