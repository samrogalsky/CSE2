/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    
    Scanner scan;
    scan = new Scanner(System.in);
    System.out.print("Enter an int- ");
    
    
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
      switch(k+p+q+r){
        case 24: 
        case 25: System.out.println("sum is 25");
        default: System.out.println("To repeat, you entered "+n);
      }
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
      switch(k+p+q+r){
        case 24: 
        case 25: System.out.println("sum is 25");
        default: System.out.println("To repeat, you entered "+n);
      }
    }
  }
}

/* Error report: Enigma0.java:27: error: variable n might not have been initialized
 *       System.out.println("To repeat, you entered "+n);
 *   Expand this comment:n was not defined outside the scope. So in the first if statement, n was defined. but only in that scope. Outside the if, n isnt defined so when it is called on in the switch statement,
 *      it doesnt know where the n is. 
 *   Explain the error(s) that occurred here, and then fix them
 *      The error occured inside the if statement, when the variable n was defined only in that scope. It also needed to be defined in the scope of the switch statement. So i took the switch statement and nested
 *      it inside both the if and else statment. This defines n in all the statements. Also, the int statment right before the switch redefines the varibale n and that is not needed for any of the functions, 
 *      so i removes that. 
 */