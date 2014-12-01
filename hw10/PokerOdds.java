//Samuel Rogalsky  
//November 18, 2014
//CSE 02
//Hw10
//Poker odds program - gives the user a random hand of 5 cards and then tells the user the probability of having one duplicate of each type of card
import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {//main method that calls two other methods. 
        showHands();//calls showHands method
        simulateOdds();//calls simulateOdds method
    }
    public static void showHands() {//showHands method which prints to the user a random hand of 5 cards, organized by the suit 
        Scanner scan = new Scanner(System.in);
        String repeat = "";
        int[] deck = new int[52];//initiates the array deck with 52 values
        int hand[] = {-1, -1, -1, -1, -1};//initiates the array hand and gives it its values of -1
        String labels[] = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};//establish the array labels and gives it its values
        do {//do while loop so that the function can be repeated and will always happen the first time. This loop establishes the hand of cards and prints it out for the user
            String cards[] = {"", "", "", ""};//establishes the array cards inside the do loop so they reset every time
            evalArray(deck);//calls evalArray method on deck. Assainges deck its values which will be 0-51
            evalArray2(hand);//calls the evalArray2 method on hand. Assaignes the values of hand a random number between 0 and 52
            changeDeck(hand, deck);//calls changeDeck array on hand and deck. will move the values in deck if they are drawn into the hand
            for (int i = 0; i < hand.length; i++) {//for loop that will run through all of the values in the hand array
                String out = "";
                int num = hand[i];
                int suit = num / 13;
                int rank = num % 13;
                for (int j = 0; j < cards.length; j++) {//for loop that runs through all of the values of the cards array.
                    if (suit == j) {//if suit equals the value of j, or the suit is the current value we are dealing with, then the number i in cards[i] will be j as well, adding up only that value. 
                        switch (rank) {//switch statement that adds up the appropriate card values dependent on their rank. adds them to the cards array. 
                            case 0:
                                cards[j] += "A ";
                                break;
                            case 1:
                                cards[j] += "K ";
                                break;
                            case 2:
                                cards[j] += "Q ";
                                break;
                            case 3:
                                cards[j] += "J ";
                                break;
                            case 4:
                                cards[j] += "10 ";
                                break;
                            case 5:
                                cards[j] += "9 ";
                                break;
                            case 6:
                                cards[j] += "8 ";
                                break;
                            case 7:
                                cards[j] += "7 ";
                                break;
                            case 8:
                                cards[j] += "6 ";
                                break;
                            case 9:
                                cards[j] += "5 ";
                                break;
                            case 10:
                                cards[j] += "4 ";
                                break;
                            case 11:
                                cards[j] += "3 ";
                                break;
                            case 12:
                                cards[j] += "2 ";
                                break;
                        }
                    }
                }
            }
            for (int i = 0; i < cards.length; i++) {//for statement that runs through all of the values of the cards array. Prints the infromation. 
                System.out.println(labels[i] + cards[i]);//prints labels and cards of i
            }
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit: ");//prompts the user to go again. 
            repeat = scan.next();
        } while (repeat.equals("y") || repeat.equals("Y"));//if the user enters a y or Y, the program will repeat. 
    }
    public static void simulateOdds() {//method simulate odds that will, after the user enters something other than a y or Y, will simulate the probability of certain cards having exactly one 
        int noPair = 0;
        int[] deck = new int[52];//assaignes deck again
        int[] dups = new int[13];//assaignes an array dups which will add up all of the duplicates 
        int hand[] = {-1, -1, -1, -1, -1};//establishes hand array with values of -1
        String rank[] = {"   A", "   K", "   Q", "   J", "  10", "   9", "   8", "   7", "   6", "   5", "   4", "   3", "   2"};//establishes the array rank with the proper values
        for (int i = 0; i < dups.length; i++) {//for statement that runs through all of the values of dups
            dups[i] = 0;//assaignes dups of i to 0
        }
        for (int k = 0; k < 10000; k++) {//loop that runs 10000 times
            evalArray(deck);//calls evalArray method on deck. Assainges deck its values which will be 0-51
            evalArray2(hand);//calls the evalArray2 method on hand. Assaignes the values of hand a random number between 0 and 52
            changeDeck(hand, deck);//calls changeDeck array on hand and deck. will move the values in deck if they are drawn into the hand
            for (int i = 0; i < hand.length; i++) {//loop that will run for every value of hand.length
                hand[i] = hand[i] % 13;//assaignes the value of hand of i the modulous of the previous value
            }
            if (exactlyOneDup(hand)) {//if the method exactlyOneDup of hand is true, else 
                for (int i = 0; i < hand.length; i++) {//for statement that runs for the length of hand array. 
                    for (int j = i + 1; j < hand.length; j++) {//for statment that runs for the length of the hand array, but will start one more than the outer loop is on
                        if (hand[i] == hand[j]) {//if these values are equal, 
                            int num = hand[i];
                            dups[num]++;//dups array of that value will incriment, assaigning a number correspoinding to each card rank. 
                        }
                    }
                }
            }
            else {
                noPair++;//no pair incriments
            }
        }
        System.out.println(" rank  freq of exactly one pair");
        for (int i = 0; i < dups.length; i++) {//for loop that runs for the length of dups
            System.out.println(rank[i] + "     " + dups[i]);//prints out the following information according to i
        }
        System.out.println("----------------------------");
        System.out.println(" Total not exactly one pair: " + noPair);
    }
    public static void changeDeck(int array1[], int array2[]) {//method that takes the drawn card out, replaces it with the last card in the deck that is not a -1. Puts a -1 in that last card's place
        for (int i = 0; i < array1.length; i++) {//for loop that will run for the length of the provided array1
            for (int j = 0 ; j < array2.length; j++) {//for loop that will run for the length of the provided array2
                if (array1[i] == j ) {//if array of i equals the j incrimentor, then the cards are equal since in the deck the value equals the number representing it
                    array2[j] = array2[51 - i];
                    array2[51 - i] = -1;
                }
            }
        }
    }
    public static boolean exactlyOneDup(int num[]) {//method that checks if there is exctly one duplicate of that number
        Boolean answer = false; 
        int k = 0;
        for (int i = 0; i < num.length; i++) {//for that runs for the duration of the array provided
            for (int j = 1 + i; j < num.length; j++) {//for loop that runs the same but starts one after the outer loop is on
                if (num[i] == num[j]) {//if they are equal
                    k++;
                }
            }
        }
        if (k == 1) {//if incrimentor equals one or if there is one duplicate
            return answer = true;
        }
        return answer;
    }
    public static void evalArray(int array[]) {//method that establishes the deck
        for (int i = 0; i < array.length; i++) {//runs for the length of the array provided
            array[i] = i;//assaignes the array value to the number that indiactes that value
        }
    }
    public static int[] evalArray2(int array[]) {//method that gives the array provided random numbers
        Random randomNum = new Random();
        for (int i = 0; i < array.length; i++) {//loop that runs for the length of the array provided
            array[i] = randomNum.nextInt(52);//gives random number
        }
        return array;
    }
}
