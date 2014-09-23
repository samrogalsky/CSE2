//Samuel Rogalsky
//September 20, 2014
//CSE 02
//HW 04
//Month Java Program - prints out days in a certain month

import java.util.Scanner;//import scanner to accept input

public class CourseNumber{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        System.out.print("Please enter a six digit int giving the course semester- ");//promts user to enter number associated to the month
        if(myScanner.hasNextInt()){//assaignts it to an if statment. Must be an int. if not, else
            int courseNumber = myScanner.nextInt();
            if( courseNumber > 186509 & 201441 > courseNumber){// tests if the int entered is in the required range. If not, esle
                int firstFour = courseNumber/100;//gets just the year from the six digits
                int justYear = firstFour*100;//gets the year into a 6 digit number without the course number
                int justSemester = courseNumber - justYear;//subtracts the two to get just the semester number
                if( justSemester == 10){//if the semester number equals 10 if not else
                    System.out.println("The course was offered in the Spring semester of "+firstFour);//prints the semester course is offered and the year
                }
                else if( justSemester == 20){//if the semester number equals 20 if not else
                    System.out.println("The course was offered in the Summer 1 semester of "+firstFour);//prints the semester course is offered and the year
                }
                else if( justSemester == 30){//if the semester number equals 30 if not else
                    System.out.println("The course was offered in the Summer 2 semester of "+firstFour);//prints the semester course is offered and the year
                }
                else if ( justSemester == 40){//if the semester number equals 40 if not else
                    System.out.println("The course was offered in the Fall semester of "+firstFour);//prints the semester course is offered and the year
                }
                else{//if the semester is a number other than 10, 20, 30, or 40
                    System.out.println(+justSemester+" is not a legitamate semester");//prints out error message
                    return;//ends program 
                }
            }
            else{//if number is not inisde range of possible course numbers
                System.out.println("The number was outside the range [186510,201440]");//prints out error message
                return;//ends program 
            }
        }
        else{//if what enters isnt an int
            System.out.println("You did not enter an int");//prints out error message
            return;//ends program 
        }
        
    }
}