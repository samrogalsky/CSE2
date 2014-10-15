//Samuel Rogalsky  
//September 14, 2014
//CSE 02
//Hw 06
//Root java program - finds the square root of a user inputed double

import java.util.Scanner;//imports scanner for user input

public class Root { //define public class
    public static void main(String[] args) { //define main method
    
        Scanner myScanner;//calls the scanner for user input
        myScanner = new Scanner(System.in);//assaignes the input to the user's keyboard
        
        System.out.print("Please enter a double and I will give you it's square root: ");//text that requests the user to enter a double
        
        if(myScanner.hasNextDouble()){//tests to see if it is an double, if not else
            double x = myScanner.nextDouble();//assaignes the double to a varibale x
            double low = 0;//assaignes the low variable to 0
            double high = 1 + x;//assaignes the high variable to 1 + the user input
            double middle = (high + low)/2;//assaignes the middle input to the average of the low and high numbers
            
            if(x > 0){//if x is greater then 0, if not else
            
                while((high - low) > (0.0000001*(1+x))){//while high minus low is greater then that number, it will repeat this loop
                    double middleSquared = middle * middle;//gets the square of the middle number
                    
                    if( middleSquared > x){//if middle squared is greater than x
                        high = middle;// reassaign high to middle 
                    }//end if
                    else{//if middle is less than x
                        low = middle;// re assaign low to middle
                    }//end else
                    
                    middle = (high + low)/2;//redefine middle so that it is always changing
                    
                }//end of while
                System.out.println("The square root of "+x+" is "+middle);//prints out the square root of the user input
            }//end of if
            else{//if x is less than or equal to zero
                System.out.println("You did not enter a double that is greater than 0");//prints out error message
            }//end of else
        }//end of if
        else{//if x is anything other then a double
            System.out.println("You did not enter a double");//prints out error messgae
        }//end of else
    }//end of main method
}//end of public class