//Samuel Rogalsky
//September 20, 2014
//CSE 02
//HW 04
//Month Java Program - prints out days in a certain month

import java.util.Scanner;//import scanner to accept input

public class Month{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        System.out.print("Please enter an int giving the number of month (1-12)- ");//promts user to enter number associated to the month
        if(myScanner.hasNextInt()){//assaignts it to an if statment. Must be an int. if not, else
        
            int month = myScanner.nextInt();//assagines int to a variable
            if( month > 0 & 13 > month){// tests if the int entered is in the required range. If not, esle
                if( month == 1|| month == 3|| month == 5|| month == 7|| month == 8|| month == 10|| month == 12){//if month equals 1,3,5,7,8,10,12 if not esle
                    System.out.println("The month has 31 days");
                }
                else if( month == 2){//if month equals 2, if not esle
                    System.out.print("Please enter an int giving the year- ");//prompts user to enter in a year
                    int year = myScanner.nextInt();//assaignes int to a varibale
                    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){//tests to see if that varibale has a remainder when divided by 4, 100, and 400.
                        System.out.println("The month has 29 days");//if has no remainder, print out this
                    }
                    else{
                        System.out.println("The months has 28 days");//if has reaminder print out this
                    }
                }
                else{// if month equals 4,6,9,11
                    System.out.println("The month has 30 days");//prints out days in month desired
                }
            }
            else{//if int is greater than 12 and less than 1
                System.out.println("You did not enter an int between 1 and 12");//prints out error message
                return;//ends program  
            }
        }
        else{//if what entered isnt an int 
            System.out.println("You did not enter an int");//prints out error message
                return;//ends program 
        }
    }
}