/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String arg[]){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(n);
    System.out.println(k);
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
      default:
        n-=3;
        k-=5;
    }
    System.out.println(n);
    System.out.println(k);
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:Exception in thread "main" java.lang.ArithmeticException: / by zero
 *       at Enigma2.main(Enigma2.java:9)
 *      The error occurs in the last line, when the variable out is trying to divide 1/k, when k is actually equal to 0.
 *      K is equal to zero in the last switch. Going into the switch, k is equal to 53 and n is equal to 98. go to case 98, Divide that by 9 in the switch, then cut off
 *      the decimals because it is casted into an int, you are left with 5. Then go to default and subtract that 5 by 5 and get zero. now k is equal to zero
 *  ALSO the [] in the main method were before arg not after it. Once they were moved, the program was able to compile
 * 
 * 
 */