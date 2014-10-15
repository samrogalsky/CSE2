//Samuel Rogalsky
//October 12, 2014
//CSE 02
//HW 06
//Roulette Java Program - Sees how many times a user wins 1000 rounds of 100 spins of a roulette game beting $1 on the same number every time

public class Roulette{//define public class
    public static void main(String[] args){//define main method
    
        int wins = 0;//assaings a wins counter and sets it to 0
        int loseEverything = 0;//assaings a counter for everytime the user lost everything (doenst win once within 100 spins) and sets it to 0
        int profitWins = 0;//assaings a counter for every time the user made a profit and sets it to 0
        
        for(int counter = 0; counter < 1000; counter++){//deisgnates a loop that will run 1000 times
            int number1 = (int)(Math.random()*38);//generates a random number between 1 and 37  
            int roundWins = 0;//asaignes a counter for how many times the user wins within each 100 spin round and sets it to zero so that it resets with each new run
            
            for(int counter2 = 0; counter2 < 100; counter2++){//designates a loop that will run 100 times
                int number2 = (int)(Math.random()*38);//generates a random number between 1 and 37
                
                if(number1 == number2){//compares the first random number to the second. if they are equal, then the win and roundWin counter will both increase by 1
                    wins++;//win counter increasing by one
                    roundWins++;//round win counter increasing by 1
                }//end of if
            }//end  for
            if(roundWins == 0){//if the variable equals 0
                loseEverything++;//increase the variable related to the user losing everything in a 100 spin round by one
            }//end if
            if(roundWins >= 3){//if the variable is less than or equal to 3
                profitWins++;//increase the variable realated to the user returning a profit in a 100 spin round by one
            }//end if
        }//end for
        int winnings = (wins*36);//getting the amount the user won in the 1000 rounds
        System.out.println("You lost everything "+loseEverything+" times");//prints the number of times the user loses everything
        System.out.println("You won $"+winnings+".00");//prints the amount of money the user won
        System.out.println("You walked away with a profit "+profitWins+" times");//prints the amount of times the user walked away with a profit
    }//end main method
}//end class