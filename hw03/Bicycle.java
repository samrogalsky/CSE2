//Samuel Rogalsky  
//September 14, 2014
//CSE 02
//Hw - 03
//Bicycle java program
import java.util.Scanner;//imports scanner for user input

public class Bicycle { //normal public class
    public static void main(String[] args) { //normal main method
        
        double wheelDiameter=27.0,//defines the diameter of the wheel
        PI=3.14159,//defines pi
        feetPerMile=5280,//defines the amount of feet in a mile
        inchesPerFoot=12,//defines the amount of inches in a foot
        secondsPerMinute=60;//defines the number of seconds in a miute
        double minutesPerHour=60;//defines the number of minutes in an hour
        double distance, time, speed;//defines distance, time, and speed as variables
        
        Scanner myScanner;//calls the scanner for user input
        myScanner = new Scanner(System.in);//assaignes the input to the user's keyboard
        
        System.out.print("Please enter the number of seconds: ");//text that requests the number of seconds
        double seconds = myScanner.nextInt();//assaignes the seconds input to the seconds variable
        
        System.out.print("Please enter the number of counts: ");//text that requests the number of counts
        int counts = myScanner.nextInt();//assainges the number of counts input to the counts variable
        
        distance=counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;//calculates distace in miles
        time=seconds/secondsPerMinute;//calculates the time in minutes
        speed=(minutesPerHour/time)*distance;//caluculates speed in miles per hour
        
        System.out.println("The distance of the trip was "+(int)(distance*100)/100.0+" miles and it took "+(int)(time*100)/100.0+" minutes.");//prints out the output of the functions to 2 decimal points
        System.out.println("The average speed was "+(int)(speed*100)/100.0+" mph.");//prints out the output of the function to 2 decimal points
        
    }
}
