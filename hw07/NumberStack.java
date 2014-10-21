//Samuel Rogalsky  
//October 18, 2014
//CSE 02
//Hw 07
//Number Stack java program - prints out a stack of numbers equating to the number that the user entered into the system
import java.util.Scanner; //imports scanner for user input

public class NumberStack { //define public class
    public static void main(String[] args) { //define main method

            Scanner myScanner; //calls the scanner for user input
            myScanner = new Scanner(System.in); //assaignes the input to the user's keyboard

            System.out.print("Enter an interger between 1 and 9: "); //text that requests the user to enter an int between 1 and 9
            if (myScanner.hasNextInt()) { //tests to see if it is an int, if not else

                int x = myScanner.nextInt(); //assaignes the int to a varibale x

                if (x >= 1 && x <= 9) { //checks to see if the int is in the appropriate range, if not else

                    int y = x; //initialize y to x to allow for the number of spaces to be determined on the number that is initially entered
                    int z = 1; //initialize z to 1 to give it its starting point
                    int d = 1; //initialize d to 1

                    System.out.println("Using for loops:"); //prints message telling the user what form of loops is being used

                    for (int a = 0; a < x; a++) { //first for statement allowing the number of blocks of numbers produced.
                        for (int b = 0; b < d; b++) { //second for statement creating the number of rows of each number. 
                            for (int g = 1; g <= y; g++) { //third for statement that allows for the printing of the spaces.
                                System.out.print(" "); //printed space
                            } // end of third for statement
                            for (int c = 0; c < z; c++) { //fourth for statement that allows for the printing of the numbers.
                                System.out.print(d); //printed number d that incements by one each time allowing the number to increase each time the loop is run
                            } //end of fourth for
                            System.out.println(); //allows the text to change line. this println is used to create blocks of the same number
                        } //end of second for
                        for (int g = 1; g <= y; g++) { //fifth for statement that allows for the printing of the spaces.
                            System.out.print(" "); //printed space
                        } //end of fifth for
                        for (int c = 0; c < z; c++) { //sixth for statement that allows for the printing of the dashes. 
                            System.out.print("-"); //printed dash
                        } //end of sixth for
                        System.out.println(); //allows the text to change line. This println is used to move on to the next number. 
                        d++; //d incrementing
                        y--; //y decrementing
                        z = z + 2; //z incrementing by two to allow it to always be odd
                    } //end of first four

                    System.out.println("Using while loops:"); //prints message telling the user what form of loops is being used

                    d = 1; //reinitialize d to 1 to erase old data
                    z = 1; //reinitialize z to 1 to erase old data
                    y = x; //reinitialize y to x to erase old data
                    int a = 0; //initialize a to 0 to to allow it to increment properly

                    while (a < x) { //first while statement allowing the number of blocks of numbers produced
                        int b = 0; //initialize b to 0
                        while (b < d) { //second while statement creating the number of rows of each number
                            int c = 0; //initialize c to 0
                            int g = 1; //initialize g to 1
                            while (g <= y) { //third while statement that allows for the printing of spaces
                                System.out.print(" "); //printed space
                                g++; //incrimenting g
                            } //end of third while statment
                            while (c < z) { //fourth while statement 
                                System.out.print(d); //printed number d that incements by one each time allowing the number to increase each time the loop is run
                                c++; //incriment c
                            } //end of fourth while statment
                            System.out.println(); //allows the text to change line. this println is used to create blocks of the same number
                            b++; //incriment b
                        } //end of second while statment
                        int c = 0; //reinitialize c to reset it
                        int g = 1; //reinitialize g to reset it
                        while (g <= y) { //fifth while statement that allows for the printing of spaces
                            System.out.print(" "); //printed space
                            g++; //incriment g
                        } //end of fifth while statment
                        while (c < z) { //sixth while statement 
                            System.out.print("-"); //printed dash
                            c++; //incriment c
                        } //end of sixth while statment
                        System.out.println(); //allows the text to change line. This println is used to move on to the next number.
                        a++; //a incrementing 
                        d++; //d incrementing
                        y--; //y decrementing
                        z = z + 2; //z incrementing by two to allow it to always be odd
                    } //end of first while statment

                    System.out.println("Using do-while loops:"); //prints message telling the user what form of loops is being used

                    d = 1; //reinitialize d to 1 to erase old data
                    z = 1; //reinitialize z to 1 to erase old data
                    y = x; //reinitialize y to x to erase old data
                    a = 0; //reinitialize a to 0 to erase old data

                    do { //do (1) this while a < x, allowing the number of blocks of numbers produced
                        int b = 0; //initialize b to 0
                        do { //do (2) this while b < d, creating the number of rows of each number
                            int g = 1; //initilize g to 1
                            do { //do (3) this while g < y, allows for the printing of the spaces
                                System.out.print(" "); //printed space
                                g++; //incriment g
                            } while (g <= y); //end of do (3)
                            int c = 0; //initilize c to 0
                            do { //do (4)this while c < z, allows for the printing of the number
                                System.out.print(d); //printed number d that incements by one each time allowing the number to increase each time the loop is run
                                c++; //incriment c
                            } while (c < z); //end of do (4)
                            System.out.println(); //allows the text to change line. this println is used to create blocks of the same number
                            b++; //incriment b
                        } while (b < d); // end of do (2)
                        int g = 1; //initialize g to 1
                        do { //do (5) this while g < y, allows for the printing of the spaces
                            System.out.print(" "); //printed space
                            g++; //incriment g
                        } while (g <= y); // end of do (5)
                        int c = 0; //initialize c to 0
                        do { //do (6) this while c < z, allows for the printing of the dashes
                            System.out.print("-"); //printed dash
                            c++; //incriment c
                        } while (c < z); // end of do (6)
                        System.out.println(); //allows the text to change line. This println is used to move on to the next number.
                        a++; //a incrementing 
                        d++; //d incrementing
                        y--; //y decrementing
                        z = z + 2; //z incrementing by two to allow it to always be odd
                    } while (a < x); // end of do (1)

                } //end of if
                else { //else for if not an interger in the required range
                    System.out.println("You did not enter an interger between 1 and 9"); //prints error message
                } //end of else
            } //end of if

            else { //else for if not an interger
                System.out.println("You did not enter an interger"); //prints error message
            } //end of else

        } //end of main method
} //end of public class