//Samuel Rogalsky  
//December 5, 2014
//CSE 02
//Hw11
//Poker Hands Program - allows user to enter a hand of cards. SHows the user the hand and tell the user the type of hand they have
import java.util.Scanner;
public class PokerHands {
    public static void main(String[] arg) {//main method that asks the user to enter the hand and stores it into an array
        Scanner scan = new Scanner(System.in);
        int[] deck = new int[52];
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        String repeat = scan.next();
        boolean initialTest = false;
        if (repeat.equals("y") || repeat.equals("Y")) {//loop that uses user input to allow the start of the loop of the program if they choose
            initialTest = true;
        }
        while (initialTest) {//beginning of the loop of the program that gets the user its hand
            for (int i = 0; i < deck.length; i++) {//loop that establishes the deck values
                deck[i] = i;
            }
            int hand[] = {//initilize hand inside this loop so that on repeat, it resets
                -1, -1, -1, -1, -1
            };
            for (int i = 0; i < hand.length; i++) {//loop that cyclues through all of the values of the hand array, storing the values if they pass the certain tests
                boolean test = true;
                boolean test2 = true;
                String suit = "";//initializes and resets suit string
                String faceS = "";//initializes and resets faceS string
                int face = 0;//initializes and resets face int
                do {//do while loop that prompts the user for input(the hand array is not stored in this do while loop)
                    test = true;
                    test2 = true;
                    do {//do while loop that repeats the first part of the initialization, the asking the user for a suit
                        test = true;
                        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                        suit = scan.next();
                        if (!suit.equals("c") && !suit.equals("d") && !suit.equals("h") && !suit.equals("s")) {//if input is not one of these, repeat this do while loop
                            System.out.println("You did not enter a valid response");
                            test = false;
                        }
                    } while (test == false);
                    do {//do while loop that repeats the second part of the initialization, the asking the user for a face. 
                        test2 = true;
                        System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                        faceS = scan.next();//assaigns the entered string to a variable
                        if (!faceS.equals("a") && !faceS.equals("k") && !faceS.equals("q") && !faceS.equals("j") && !faceS.equals("10") && !faceS.equals("9") && !faceS.equals("8") && !faceS.equals("7") && !faceS.equals("6") && !faceS.equals("5") && !faceS.equals("4") && !faceS.equals("3") && !faceS.equals("2")) {//if the user does not enter one of these, repeat the do while loop
                            System.out.println("You did not enter a valid response");
                            test2 = false;
                        }
                    } while (test2 == false);
                    switch (faceS) {//gives a numerical value to just the CARD FACE VALUE
                        case "a":
                            face = 0;
                            break;
                        case "k":
                            face = 1;
                            break;
                        case "q":
                            face = 2;
                            break;
                        case "j":
                            face = 3;
                            break;
                        case "10":
                            face = 4;
                            break;
                        case "9":
                            face = 5;
                            break;
                        case "8":
                            face = 6;
                            break;
                        case "7":
                            face = 7;
                            break;
                        case "6":
                            face = 8;
                            break;
                        case "5":
                            face = 9;
                            break;
                        case "4":
                            face = 10;
                            break;
                        case "3":
                            face = 11;
                            break;
                        case "2":
                            face = 12;
                            break;
                        default:
                            break;
                    }
                    switch (suit) {//adds on the numerical weight of the suit onto the card face int in the previous switch
                        case "c":
                            break;
                        case "d":
                            face += 13;
                            break;
                        case "h":
                            face += 26;
                            break;
                        case "s":
                            face += 39;
                            break;
                    }
                    if (deck[face] == -1) {//loop that tests if the user already entered that card. if they did already enter that card, repeats whole do while loop
                        System.out.println("You already entered that card");
                        test = false;
                    }
                } while (test == false);//end of the outer do while loop
                deck[face] = -1;//replaces the value chose with a -1 so that the user does not pick that card again
                hand[i] = face;//puts the picked card into the users hand. 
            }//end of outer for loop
            showOneHand(hand);//calls showOneHand method
            evaluateHand(hand);//calls evaluateHand method
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
            repeat = scan.next();
            initialTest = false;
            if (repeat.equals("y") || repeat.equals("Y")) {//if user enters one of those, repeat whole program. if not, quit. 
                initialTest = true;
            }
        }//end of the initial while loop
    }

    public static void evaluateHand(int hand[]) {//method evaluate hand that takes the array hand from the previous method, and checks to see what type of hand the cards are. 
        int[] handRank = new int[5];
        int[] handSuit = new int[5];
        int[] frequencyDups = new int[5];
        int counter = 0, counter2 = 0, counter3 = 0;
        boolean answer = true;
        for (int i = 0; i < hand.length; i++) {//gives handRank the rank of the hand array and handSuit the suit of the hand array
            handRank[i] = hand[i] % 13;
            handSuit[i] = hand[i] / 13;
        }
        int[] frequencyRank = new int[13];
        for (int i = 0; i < frequencyRank.length; i++) {
            frequencyRank[i] = 0;
        }
        for (int i = 0; i < frequencyDups.length; i++) {
            frequencyDups[i] = 0;
        }
        for (int i = 0; i < handRank.length; i++) {//counts up the frequency of each rank
            frequencyRank[handRank[i]] ++;
        }
        for (int i = 0; i < frequencyRank.length; i++) {//counts up the frequency of each number of repeated card. ie 2 5's would increase frequencyRank[2] by 1. 4 5's would increase frequencyRank[4]
            switch (frequencyRank[i]) {
                case 0:
                    frequencyDups[0] ++;
                    break;
                case 1:
                    frequencyDups[1] ++;
                    break;
                case 2:
                    frequencyDups[2] ++;
                    break;
                case 3:
                    frequencyDups[3] ++;
                    break;
                case 4:
                    frequencyDups[4] ++;
                    break;
            }
        }
        if (frequencyDups[1] == 5) {//if there are no repeated cards, it can only be these. tests to see which one it is. 
            for (int j = 0; j < frequencyRank.length; j++) {//for loop that locates where, if there is sequential cards, where they start in the array of frequencyRank
                if (frequencyRank[j] == 1) {
                    counter2 = j;
                    break;
                }
            }
            for (int i = counter2; i < frequencyRank.length - 1; i++) {//for loop that counts up the number of 1's in a row before a 0 in frequencyRank array. checks for squence
                if (frequencyRank[i] == frequencyRank[i + 1] && frequencyRank[i] == 1) {
                    counter3++;
                }
            }
            if (counter3 != 4) {//if there are not 4 cards in a row, then they are not in sequence
                for (int i = 0; i < handSuit.length - 1; i++) {//for loop that sees if the hand is of all the same suit
                    if (handSuit[i] == handSuit[i + 1]) {
                        counter++;
                    }
                }
                if (counter == 4) {//if the counter is 4, they are all the same suit but not in sequence
                    System.out.println("This is a Flush");
                    return;
                }
                else {//not all the same suit and not in sequence
                    System.out.println("This is a High Card");
                    return;
                }
            }
            else {//if there are 4 cards in a row, they are in sequence 
                for (int i = 0; i < handSuit.length - 1; i++) {//for loop that sees if the hand is of all the same suit
                    if (handSuit[i] == handSuit[i + 1]) {
                        counter++;
                    }
                }
                if (counter == 4) {//if the counter is 4, they are all the same suit and in sequence
                    if (frequencyRank[0] == 1) {//if the first value is a 1, then it is a royal flush since frequencyRank[0] represents an ACE
                        System.out.println("This is a Royal Flush");
                        return;
                    }
                    else {//if the counter is 4, they are all the same suit and in sequence but not a royal flush
                        System.out.println("This is a Straight Flush");
                        return;
                    }
                }
                else {//not all the same suit but in squence
                    System.out.println("This is a Straight");
                    return;
                }
            }
        }
        if (frequencyDups[2] >= 1) {// if there are one or more two of a kind pairs
            if (frequencyDups[3] == 1) {//if there is a 3 of a kind and a two of a kind, 
                System.out.println("This is a Full House");
                return;
            }
            else if (frequencyDups[2] == 1) {//if there is only one two of a kind
                System.out.println("This is a One Pair");
                return;
            }
            else {// if there are two two of a kinds
                System.out.println("This is a Two Pair");
                return;
            }
        }
        if (frequencyDups[3] == 1) {//if there is a 3 of a kind and no two of a kind pairs
            System.out.println("This is Three of a Kind");
            return;
        }
        if (frequencyDups[4] == 1) {//if there is a 4 of a kind
            System.out.println("This is Four of a Kind");
            return;
        }
    }
    public static void showOneHand(int hand[]) {//method showOneHand that takes an array as input and prints it
        String suit[] = {
            "Clubs:    ", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {//for statement that cycles through the suit array
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)//for loop that cycles through every possible rank
                for (int card = 0; card < 5; card++)//for loop that cycles through the passed method
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }

}