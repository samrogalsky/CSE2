//Samuel Rogalsky
//October 24, 2014
//CSE 02
//Lab 09
//Methods java program - tells the user if or if not the three entered ints are in ascending order

import java.util.Scanner;
public class Methods{
    
    public static int larger(int a, int b){
        int answer = 0;
        if(a > b){
            answer = a;
        }
        else{
            answer = b;
        }
        return answer;
    }
    
    public static boolean ascending(int a, int b, int c){
        return(a < b & b < c);
    }
    
    public static int getInt(Scanner scan){
        int value = 0;
        System.out.print("Enter an int- ");
        while (!scan.hasNextInt()){
            System.out.print("You did noy enter an int; try again- ");
            scan.next();
        }
        value = scan.nextInt();
        return value;
    }
    
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  }
}