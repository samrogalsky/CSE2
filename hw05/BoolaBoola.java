//Samuel Rogalsky
//September 29, 2014
//CSE 02
//HW 05
//Boola Boola Java Program - Asks the user to answer a randomly generated t/f statement

import java.util.Scanner;//import scanner to accept input

public class BoolaBoola{//define public class
    
    public static void main(String[] args){//define main method
        
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        int number1 = (int)(Math.random()*2)+1;//gets a random number 1-2 and assagines it to a variable
        int number2 = (int)(Math.random()*2)+1;//gets a random number 1-2 and assagines it to a variable
        int number3 = (int)(Math.random()*2)+1;//gets a random number 1-2 and assagines it to a variable
        int number4 = (int)(Math.random()*2)+1;//gets a random number 1-2 and assagines it to a variable
        int number5 = (int)(Math.random()*2)+1;//gets a random number 1-2 and assagines it to a variable
        
        String aspect1 = "";//assaignes a string to variable
        String aspect2 = "";//assaignes a string to variable
        String aspect3 = "";//assaignes a string to variable
        String aspect4 = "";//assaignes a string to variable
        String aspect5 = "";//assaignes a string to variable
        
        switch (number1){//switch for random number 1
            case 1: aspect1 = "true";//if random number equals 1
                    break;//end
            default: aspect1 = "false";//if random number equals 2
                    break;//end
        }
        
        switch (number2){//switch for random number 2
            case 1: aspect2 = "||";//if random number equals 1
                    break;//end
            default: aspect2 = "&&";//if random number equals 2
                    break;//end
        }
        
        switch (number3){//switch for random number 3
            case 1: aspect3 = "true";//if random number equals 1
                    break;//end
            default: aspect3 = "false";//if random number equals 2
                    break;//end
        }
        
        switch (number4){//switch for random number 4
            case 1: aspect4 = "||";//if random number equals 1
                    break;//end
            default: aspect4 = "&&";//if random number equals 2
                    break;//end
        }
        
        switch (number5){//switch for random number 5
            case 1: aspect5 = "true";//if random number equals 1
                    break;//end
            default: aspect5 = "false";//if random number equals 2
                    break;//end
        }

        System.out.print("Does "+aspect1+" "+aspect2+" "+aspect3+" "+aspect4+" "+aspect5+" have the value true(t/T) or false(f/F)? ");
        String answer = myScanner.next();
        
        switch (answer){//switch for user defined string
            case "T": answer = "t";//if string equals T, change to t
                    break;//end
           case "F": answer = "f";//if string equals F, change to f
                    break;//end
        }
        
        String aspect6 = "";//assaignes string to variable
        
        if(aspect1.equals("false") || aspect3.equals("false") || aspect5.equals("false")){//if any of those is false, if not else
            aspect6 = "f";//answer will be f or false
        }
        else{
            aspect6 = "t";//answer will be t or true
        }
        
        if (answer.equals(aspect6)){//if answer to question equals user entered answer, if not else
            System.out.println("Correct");//print correct
        }
        else{
            System.out.println("Wrong; try again");//print wrong
        }
        
    }
}