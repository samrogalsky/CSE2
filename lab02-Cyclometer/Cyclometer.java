//Samuel Rogalsky
//September 5, 2014
//CSE 02
//Lab 02
//Cyclometer Java Program

//Defined Class
public class Cyclometer { 
    //Definined Main Methond
    public static void main (String[] args ){
        int secsTrip1=480;//number of seconds that trip one took
        int secsTrip2=3220;//number of seconds that trip two took
        int countsTrip1=1561;//number of rotations that trip one took
        int countsTrip2=9037;//number of rotations trip two took
        double wheelDiameter=27.0,//the wheel's diameter on the bycicle used
        PI=3.14159,//the value of PI
        feetPerMile=5280,//the number of feet in one mile
        inchesPerFoot=12,//the number of inches in one foot
        secondsPerMinute=60;//the number of seconds in one minute
        double distanceTrip1, distanceTrip2, totalDistance;//double allows for decimals, making the outputs more accurate
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");//displays the variables for trip one
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");//displays the variables for trip two
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;//gives the distance in inches that the rotation of the wheel travels the diameter in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile;//Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
    
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");//prints output data

    }//end of main method
    
}//end of class
