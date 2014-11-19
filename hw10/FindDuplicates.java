//Samuel Rogalsky  
//November 18, 2014
//CSE 02
//Hw 10
//
import java.util.Scanner;
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];//establishes array of num 
        String answer = "";
        do {//loop that always occurs the first time. Has perameters for the second run
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {//loop that will run 10 times. 
                num[j] = scan.nextInt();//gives the array num the vales that the user enters
            }
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {//if has dups is true
                out += "has ";//adds this to string out
            }
            else {//if has dups is false
                out += "does not have ";//adds this to string out
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) { //if exactlyOneDup is true
                out += "has ";//adds this to string out
            }
            else {//if false
                out += "does not have ";//adds this to string out
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));//will run again if the user enters a y or Y
    }

    public static String listArray(int num[]) {//method that prints out array
        String out = "{";
        for (int j = 0; j < num.length; j++) {//runs for the length of the array provided
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;//returns the string out
    }
    public static boolean hasDups(int num[]) {//method that checks if the array has duplicates
        Boolean answer = false;
        for (int i = 0; i < num.length; i++) {//will run for the length of the array given
            for (int j = 1+i; j < num.length; j++) {//will run for one more than where the previous loop is at
                if (num[i] == num[j]) {//if any values are equal
                    return answer = true;//return true straight away
                }
            }
        }
        return answer;
    }
    public static boolean exactlyOneDup(int num[]) {//method that tests if the array has just one duplicate
        Boolean answer = false;
        int k = 0;//assaignes counter to zero
        for (int i = 0; i < num.length; i++) {//will run for the length of the array given
            for (int j = 1+i; j < num.length; j++) {//will run for one more than where the previous loop is at
                if (num[i] == num[j]) {//if they are equal
                    k++;//increase counter
                }
            }
        }
        if (k == 1) {//if k equals one, or there is only one duplicate
            return answer = true;
        }
        return answer;
    }
}