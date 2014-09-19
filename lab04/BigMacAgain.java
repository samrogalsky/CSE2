//Samuel Rogalsky
//September 5, 2014
//CSE 02
//Lab 04
//Big Mac Again Java Program - How much Big Macs cost with or without Fries

import java.util.Scanner;//import scanner to accept input

public class BigMacAgain{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        double fryCost$ = 2.15;//define the cost of fries
        
        System.out.print("Please enter the number of Big Macs: ");//promts user to enter number of Big Macs
        if(myScanner.hasNextInt()){//assaignts it to an if statment. Must be an int. if not, else
            
            int nBigMacs = myScanner.nextInt();//Assaignes big macs to nBigMacs variable
            if(nBigMacs > 0){//if big nBigMacs is greater then zero, if not else.
                
                int dollars, dimes, pennies;//assaignes ints to dimes, dollars, pennies to truncate
                double cost$ = nBigMacs*2.22;//finds the cost of the big macs by multiplying quantity from cost
                dollars=(int)cost$;//assaignes the dollar int
                dimes=(int)(cost$*10)%10;//assaignes the dimes int
                pennies=(int)(cost$*100)%10;//assaignes the pennies int
                System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x2.22 = $"+dollars+"."+dimes+pennies);//prints out the cost in dollars, dimes, and pennies to help with rounding
                
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");//asks if users want fries. 
                
                if(myScanner.hasNext()){//if string, if not else
                    
                    String answer=myScanner.next();//assaignes the answer to a variable: answer
                    
                    if(answer.equals("Y")||answer.equals("y")||answer.equals("N")||answer.equals("n")){//if answer is Y,y,N,n, if not else
                        
                        if(answer.equals("Y")||answer.equals("y")){//if answer is Y,y if not else
                            
                            int dollarsEnd, dimesEnd, penniesEnd;//assaignes ints to dimes, dollars, pennies to truncate
                            double totalCost$ = cost$ + fryCost$;//finds total cost with fries
                            dollarsEnd = (int)totalCost$;//assaignes to dollars int for total cost
                            dimesEnd = (int)(totalCost$*10)%10;//assaignes to dimes int for total cost
                            penniesEnd = (int)(totalCost$*100)%10;//assagines to pennies int for total cost
                            System.out.println("You ordered fries that cost $2.15");//prints cost of fries
                            System.out.println("The total cost of the meal is $"+dollarsEnd+"."+dimesEnd+penniesEnd);//prints cost of total meal in dollars, dimes, and pennies to help with rounding
                            
                        }
                        else{
                            System.out.println("The total cost of the meal is $"+dollars+"."+dimes+pennies);//gives an else if answers N,n to fries. Gives just cost of bigmacs in dollars, dimes, and pennies to help with rounding
                        }
                    }
                    else{
                        System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");//gives an else if user does not enter a Y,y,N,n in prompt but still enters a string. Gives error
                        return;//ends program
                    }
                    
                }
                else{
                    System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");//gives an else if user does not enter a string in prompt. gives error
                    return;//ends program
                    
                }
                
            }
            else{
                System.out.println("You did not enter an int > 0");//else if user does not enter an int greater than 0. displays an error message
                return;//ends program
                }
        }
        else{
            System.out.println("You did not enter an int");//else if user does not enter an int. displays error message
            return;//ends program
        }
        
     
        

        
    }//end of main method
}//end of public class

