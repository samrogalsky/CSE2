//Samuel Rogalsky  
//October 28, 2014
//CSE 02
//Hw 08
//HW8 Java Program - Asks the user to answer a series of questions to test methods
import java.util.Scanner; //imports scanner for user input

public class HW8 { //define public class
    public static void main(String[] arg) { //defines the MAIN method
            char input; //defines input as a character
            Scanner scan = new Scanner(System.in); ///calls scanner for user input and defines it on variable Scan
            System.out.print("Enter 'C' or 'c' to continue "); //prints lines prompting the user to enter C or c
            input = getInput(scan, "Cc"); //calls the getInput method and assaignes the returned output of the method to the char input
            System.out.println("You entered '" + input + "'"); //prints the returned input from the first call of the getInput method
            System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //prompts the user to enter y Y n or N
            input = getInput(scan, "yYnN", 5); //calls the getInput method and assaignes the returned output of the method to the char input. use the given string. give up after 5 attempts.
            if (input != ' ') { //if the returned char does not equal just a space, else do nothing
                System.out.println("You entered '" + input + "'"); //prints the returned input from the second call of the getInput method
            } //end of if
            input = getInput(scan, "Choose a digit.", "0123456789"); //calls the getInput method and assaignes the returned output of the method to the char input, use the given strings
            System.out.println("You entered '" + input + "'"); //prints the returned input from the third call of the getInput method
        } //end of MAIN method

    public static char getInput(Scanner scan, String a) { //start of first getInput method

            String userInput = scan.next(); //assaigns user input to string called userInput

            while (userInput.length() != 1) { //while that tests the length of the string, if it is more then one, than it cant be a char. so it will repeatedly prompt the user for a new input until it is a length of 1
                System.out.print("You should enter exactly one character- "); //gives the user an error message
                userInput = scan.next(); //gets the next input and assaignes it to string userInput
            } //end of while

            char input = userInput.charAt(0); //converts the string userInput to a char input
            char c = a.charAt(0); //gets the first letter of the provided string and converts it to a char
            char d = a.charAt(1); //gets the second letter of the provided string and converts it to a char

            while (!(input == c) && !(input == d)) { //while that compares the chars in the string provided to the user input. if they dont equal, it will repeat until they do
                System.out.print("You did not enter a character from the list 'Cc'; try again- "); //gives the user an error message
                userInput = scan.next(); //gets the next input and assaignes it to string userInput

                while (userInput.length() != 1) { //while that tests the length of the new string, if it is more then one, than it cant be a char. so it will repeatedly prompt the user for a new input until it is a length of 1
                    System.out.print("You should enter exactly one character- "); //gives the user an error message
                    userInput = scan.next(); //gets the next input and assaignes it to string userInput
                } //end of while

                input = userInput.charAt(0); //converts the string userInput to a char input

            } //end of while

            return input; //returns the value of char input to the variable input in the main method

        } //end of first getInput method

    public static char getInput(Scanner scan, String a, int h) { //start of second getInput method

            int counter = 0; //sets a counter variable equal to 0
            String userInput = scan.next(); //assaigns user input to string called userInput

            while (userInput.length() != 1 && counter < h) { //while tests the length of the string, if it is more then one, than it cant be a char. so it will repeatedly prompt the user for a new input until it is a length of 1 or counter is equal to the int H so each time it fails, it will add to the fails counter.
                System.out.print("You should enter exactly one character- "); //gives the user an error message
                userInput = scan.next(); //gets the next input and assaignes it to string userInput
                counter++; //incriments fails counter
            } //end of while

            char input = userInput.charAt(0); //converts the string userInput to a char input
            char c = a.charAt(0); //gets the first letter of the provided string and converts it to a char
            char d = a.charAt(1); //gets the second letter of the provided string and converts it to a char
            char e = a.charAt(2); //gets the third letter of the provided string and converts it to a char
            char f = a.charAt(3); //gets the fourth letter of the provided string and converts it to a char

            while (input != c && input != d && input != e && input != f && counter < h) { //while that compares the chars in the string provided to the user input. if they dont equal, it will repeat until they do or until the fails counter equals the int h. 
                System.out.print("You did not enter a character from the list 'yYnN'; try again- "); //gives user an error message
                userInput = scan.next(); //gets the next input and assaignes it to string userInput

                while (userInput.length() != 1 && counter < h) { //tests the length of the new string, if it is more then one, than it cant be a char. so it will repeatedly prompt the user for a new input until it is a length of 1
                    System.out.print("You should enter exactly one character- "); //gives the user an error message
                    userInput = scan.next(); //gets the next input and assaignes it to string userInput
                    counter++; //incriments the fails counter
                } //end of while

                if (counter == h) { //if the fails counter equals the provided int h
                    System.out.println("You failed after 5 times"); //gives the user an error message
                    return input = ' '; //returns the value of char input that equals a space to the variable input in the main method that will then fail out of the if statment in the main method and print nothing else besides the error message
                } //end of if

                input = userInput.charAt(0);
                counter++;

            } //end of while

            if (counter == h) { //if the fails counter equals the provided int h
                System.out.println("You failed after 5 times"); //gives the user an error message
                return input = ' '; //returns the value of char input that equals a space to the variable input in the main method that will then fail out of the if statment in the main method and print nothing else besides the error message
            } //end of if

            return input; //returns the value of char input to the variable input in the main method

        } //end of second getInput method

    public static char getInput(Scanner scan, String a, String b) { //start of third getInput method

            System.out.println(a); //prints the string a
            System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-  "); //prints a message prompting the user to enter one of the valid chars
            String userInput = scan.next(); //gets the next input and assaignes it to string userInput

            while (userInput.length() != 1) { //while that tests the length of the string, if it is more then one, than it cant be a char. so it will repeatedly prompt the user for a new input until it is a length of 1
                System.out.println("You should enter exactly one character"); //gives the user an error message
                System.out.println(a); //reprints the string a
                System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-  "); //reprints a message prompting the user to enter one of the valid chars
                userInput = scan.next(); //gets the next input and assaignes it to string userInput
            } //end of while

            char input = userInput.charAt(0); //converts the string userInput to a char input
            char c = b.charAt(0); //gets the first letter of the provided string and converts it to a char
            char d = b.charAt(1); //gets the second letter of the provided string and converts it to a char
            char e = b.charAt(2); //gets the third letter of the provided string and converts it to a char
            char f = b.charAt(3); //gets the fourth letter of the provided string and converts it to a char
            char g = b.charAt(4); //gets the fifth letter of the provided string and converts it to a char
            char h = b.charAt(5); //gets the sixth letter of the provided string and converts it to a char
            char i = b.charAt(6); //gets the seventh letter of the provided string and converts it to a char
            char j = b.charAt(7); //gets the eigth letter of the provided string and converts it to a char
            char k = b.charAt(8); //gets the ninth letter of the provided string and converts it to a char
            char l = b.charAt(9); //gets the tenth letter of the provided string and converts it to a char

            while (input != c && input != d && input != e && input != f && input != g && input != h && input != i && input != j && input != k && input != l) { //while that compares the chars in the string provided to the user input. if they dont equal, it will repeat until they do
                System.out.println("You did not enter an acceptable character "); //gives the user an error message
                System.out.println(a); //reprints the string a
                System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-  "); //reprints a message prompting the user to enter one of the valid chars
                userInput = scan.next(); //gets the next input and assaignes it to string userInput

                while (userInput.length() != 1) { //while that tests the length of the string, if it is more then one, than it cant be a char. so it will repeatedly prompt the user for a new input until it is a length of 1
                    System.out.println("You should enter exactly one character"); //gives the user an error messag
                    System.out.println(a); //reprints the string a
                    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-  "); //reprints a message prompting the user to enter one of the valid chars
                    userInput = scan.next(); //gets the next input and assaignes it to string userInput
                } //end of while

                input = userInput.charAt(0); //converts the string userInput to a char input

            } //end of while

            return input; //returns the value of char input to the variable input in the main method

        } //end of third getInput method
} //end of public class
