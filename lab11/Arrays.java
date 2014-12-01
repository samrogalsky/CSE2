//Samuel Rogalsky
//November 14, 2014
//CSE 02
//Lab 11
//Arrays java program - asks user to enter ints, makes into an array, gets certain info out of the arrays
import java.util.Scanner;
public class Arrays{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 ints- ");
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i]= scan.nextInt();
        }
        int printMin = 0;
        int printMax = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
                printMin = i;
            }
        }
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
                printMax = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("The lowest entry is: "+min);
        System.out.println("The hightest entry is: "+max);
        System.out.println("The sum is "+sum);

        int [] numbersReversed = new int[10];
        for(int i = 0; i<numbersReversed.length; i++){
            numbersReversed[i]=numbers[9-i];
        }
        int d, c;
        String spaces = "";
        String spaces2 = "";
        for (int i = 0; i < numbersReversed.length; i++){
            d = numbers[i];
            c = numbersReversed[i];
            if(10>d && d>-1){
                spaces = "   ";
            }
            else{
                spaces = "  ";
            }
             if(10>c && c>-1){
                spaces2 = "   ";
            }
            else{
                spaces2 = "  ";
            }
            System.out.println(spaces+numbers[i]+spaces2+numbersReversed[i]);
        }

    }
}