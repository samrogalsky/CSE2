//Samuel Rogalsky  
//November 4, 2014
//CSE 02
//Hw 09
//Blocked again java program- prints out a stack of numbers equating to the number that the user entered into the system using methods
import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {//main method that calls getInt to obtain an int. Then preforms allBlocks on the int to print the text
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
    
    public static int getInt() {//method that gets int by calling checkInt and checkRange. If it satisfies those tests, the method will return the int entered
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an in int between 1 and 9, inclusive: ");
        int num = checkInt(scan);
        while (checkRange(num) == false) {//while the call of check range on the num is false, repeat
            num = checkInt(scan);//recall checkInt to obtain a new number
        }
        return num;
    }
    
    public static int checkInt(Scanner scan) {//method that checks if the input is an int. 
        while (!scan.hasNextInt()) {//while the input is not an int, repeat. 
            System.out.print("You did noy enter an int; try again: ");
            scan.next();
        }
        int value = scan.nextInt();
        return value;
    }
    
    public static boolean checkRange(int a) {//method that checks if the int is in the appropriate range. If it is, return true. if not return false
        while (a > 9 || a < 1) {//while the int a is more than 9 or less then 1, repeat. 
            System.out.print("You did not enter an int in [1,9]; try again: ");
            return false;
        }
        return true;
    }
    
    public static void allBlocks(int x) {//method that prints the text. calls method block and line 
        int y = x; 
        int z = 1; 
        int d = 1;
        String h = "-";
        for (int a = 0; a < x; a++) { //first for statement allowing the number of blocks of numbers produced.
            block(d, z, y);//calls block to call line to print the amount of numbers, the appropriate number, the spaces, and the dashes
            line(h, z, y);//calls line to print the spaces and the string
            System.out.println();
            d++; 
            y--; 
            z = z + 2;
        } 
    }
    
    public static void block(int d, int z, int y) {//method that prints the numbers and spaces by calling line method
        String v = "" + d;//converts d to a string so that line method will work for multiple instnaces
        for (int a = 0; a < d; a++) {//repeats the loop each time the first for loop is repeated
            line(v, z, y);//calls the line method to print spaces and the number
            System.out.println();
        }
    }
    
    public static void line(String v, int z, int y) {//line method that prints the string assaigned and the spaces
        for (int a = 1; a <= y; a++) { 
            System.out.print(" "); 
        }
        for (int a = 0; a < z; a++) { 
            System.out.print(v);
        } 

    }
}
