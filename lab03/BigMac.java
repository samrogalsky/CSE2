//Samuel Rogalsky
//September 12, 2014
//CSE 02
//Lab - 03
//Big Mac Java Program
import java.util.Scanner;//Scanner goes first to avoid compiler errors

public class BigMac {
    
   	public static void main(String[] args) {//main method required
   	    
   	     Scanner myScanner;//declare a scanner object
   	     myScanner = new Scanner( System.in );//call the scanner instructor
   	     
   	     System.out.print("Enter the number of Big Macs(an integer > 0):");//text that requests number of burgers
   	     int nBigMacs = myScanner.nextInt();//calls a method that the scanner object has and assaigns to the nBigMacs variable
   	     
   	     System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx):" );//text that requests cost of burgers
   	     double bigMac$ = myScanner.nextDouble();//calls a method that the scanner object has and assaigns to the bigMac$ variable
   	     System.out.print("Enter the percent tax as a whole number (xx): ");//text that requests the tax
   	     double taxRate = myScanner.nextDouble();//calls a methos that the scanner object has and assaigns to the taxRate variable
   	     taxRate/=100;//Shows that tax rate actaully is the interger over 100
   	     
   	     double cost$;
   	     int dollars,//whole dollar amount of cost 
   	     dimes, pennies;//for storing digits
   	     //to the right of the decimal point 
         //for the cost$ 
         cost$ = nBigMacs*bigMac$*(1+taxRate);
         //get the whole amount, dropping decimal fraction
         dollars=(int)cost$;
         //get dimes amount, e.g.,
         // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
         //  where the % (mod) operator returns the remainder
         //  after the division:   583%100 -> 83, 27%5 -> 2
         dimes=(int)(cost$*10)%10;
         pennies=(int)(cost$*100)%10;
         System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);//printing the final product

   	}  
  }
