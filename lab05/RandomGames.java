//Samuel Rogalsky
//September 20, 2014
//CSE 02
//Lab 05
//Random Games Java Program - Lets the user play roulette, craps, or pick a card

import java.util.Scanner;//import scanner to accept input

public class RandomGames{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");//prompts the user to enter a string equating to a game
        
        String answer = myScanner.next();//assaignes sting entered into variable
        
        if(answer.length() == 1){//if string has length of one. if not else
            if(answer.equals("R") || answer.equals("r") || answer.equals("C") || answer.equals("c") || answer.equals("P") || answer.equals("p")){//if sting is equal to one of these, if not else
                 if(answer.equals("R") || answer.equals("r")){//if equals R or r, if not else
                    int number = (int)(Math.random()*38);//generates a random number between 1 and 38
                    int roulette = 0;//assaignes the int roulette to zero
                    String roulette2 = "";//defines the variable roulette2 as a string
                    switch (number){//starts switch
                        case 37: roulette2 = "00";//if random number equals 38, string roulette2 = 00
                                 break;//ends
                        default: roulette = number;//if any other number, the values stay the same
                                 break;//end
                    }
                    if (number == 37){//if the random number equals 37, if not else
                        System.out.println("Roulette: "+roulette2);//prints string 
                    }
                    else{
                        System.out.println("Roulette: "+roulette);//prints int
                    }
                }
                else if(answer.equals("C") || answer.equals("c")){//if string equals c, if not else
                    int number2 = (int)(Math.random()*6)+1;//generates random number 1-6
                    int number3 = (int)(Math.random()*6)+1;//generates random number 1-6
                    int total = number2 + number3;//adds the two random numbers
                    System.out.println("Craps: "+number2+" + "+number3+" = "+total);//prints out answers
                }
                else{//if letter does not equal r or c
                    int number4 = (int)(Math.random()*4)+1;//gets a random number 1-4
                    int number5 = (int)(Math.random()*13)+1;//gets a random number 1-13
                    String suit = "";//defines the variable as a string
                    String card = "";//defines the variable as a string
                    int cardNumber = 0;//assaignes the variable as an int
                    switch (number4){
                        case 1: suit = "Spades";//if equals 1, assaign string
                                break;
                        case 2: suit = "Hearts";//if equals 2, assaign string
                                break;
                        case 3: suit = "Clubs";//if equals 3, assaign string
                                break;
                        case 4: suit = "Diamonds";//if equals 4, assaign string
                                break;
                    }
                    switch (number5){
                        case 1: card = "Ace";//if equals 1, assaign string
                                break;
                        case 11: card = "Jack";//if equals 11, assaign string
                                break;
                        case 12: card = "Queen";//if equals 12, assaign string
                                break;
                        case 13: card = "King";//if equals 13, assaign string
                                break;
                        default: cardNumber = number5;//sets default to assaign int as the random number
                                break;
                    }
                    if (number5 == 1 || number5 == 11 || number5 == 12 || number5 == 13){//if the number equals one of these, if not else
                        System.out.println("Pick a card: "+card+" of "+suit);//print strings
                    }
                    else{
                        System.out.println("Pick a card: "+cardNumber+" of "+suit);//prints string and ints
                    }
                 }
            }
            else{
                System.out.println("'"+answer+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");//gives an else if user does not enter one of the correct letters
                return;//ends program
            }
        }
        else{
            System.out.println("A single character expected");//gives an else if user does not enter a single character
            return;//ends program
        }
    }
}