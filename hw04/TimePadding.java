//Samuel Rogalsky
//September 20, 2014
//CSE 02
//HW 04
//Time Padding Java Program - Displays entered time in a conventional form

import java.util.Scanner;//import scanner to accept input

public class TimePadding{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        System.out.print("Please enter the time in seconds: ");//prompts the user to enter in the number of seconds
        int seconds = myScanner.nextInt();//assaignes it to a variable 
        int hours = (int)(seconds/3600);//gets the number of hours and assaignes it to an int
        int minutes = (int)((seconds % 3600)/60);//gets the number of minutes and assaignes it to an int
        int actualSeconds = (int)(seconds - ((minutes*60)+(hours*3600)));//gets the seconds left by subtracting total time from the minutes and hours reconverted to seconds
       
        if (minutes > 10 && actualSeconds > 10){//if minutes and seconds are greater then 10, if not else
            System.out.println("The time is "+hours+":"+minutes+":"+actualSeconds+".");//prints time with no padding
        }
        else if (minutes < 10 && actualSeconds > 10){//if minutes are less then 10 and seconds are greater then 10, if not else
            System.out.println("The time is "+hours+":0"+minutes+":"+actualSeconds+".");//prints time with padding on minutes
        }
        else if (minutes > 10 && actualSeconds < 10){//if minutes are greater then 10 and seconds are less then 10, if not else
            System.out.println("The time is "+hours+":"+minutes+":0"+actualSeconds+".");//prints time with padding on seconds
        }
        else if (minutes < 10 && actualSeconds < 10){//if minutes and seconds are less then 10, if not else
            System.out.println("The time is "+hours+":0"+minutes+":0"+actualSeconds+".");//prints time with padding on both
        }
    
    }
}