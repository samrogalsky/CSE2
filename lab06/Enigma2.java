import java.util.Scanner;
public class Enigma2{
  public static void main(String arg[]){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *          Exception in thread "main" java.lang.ArithmeticException: / by zero
 *          at Enigma2.main(Enigma2.java:9)
 *      The java.lang expection shows us that the runtime error is when the user attempts to divide
 *      40 by zero because the error says / by zero. 
 *  ALSO the [] in the main method were before arg not after it. Once they were moved, the program was able to compile
 * 
 * 
 * 
 * 
 */