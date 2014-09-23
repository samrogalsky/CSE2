//Samuel Rogalsky
//September 20, 2014
//CSE 02
//HW 04
//Income Tax Java Program. Will display the amount of tax on certain incomes

import java.util.Scanner;//import scanner to accept input

public class IncomeTax{//define public class

    public static void main(String[] args){//define main method
    
        Scanner myScanner;//call scanner class
        myScanner = new Scanner(System.in);//define scanner
        
        System.out.print("Enter an int giving the number of thousands- ");//ask for int of money
        if(myScanner.hasNextInt()){//tests to see if it is an int, if not else
            int money = myScanner.nextInt();//assaignes the int to a varibale
            double totalMoney = money * 1000;//multiplies the int to find the actal number of dollars in thousands
            if(money > 0){//tests to see if the int is greater than zero, if not else
                if(20 > money){//if the int is less then 20, if not else
                    double total1$ = (int)((totalMoney*.05)*10)/10;//multiply by the assaigned rate and cast to an int to truncate
                    System.out.println("The tax rate on $"+money+",000 is 5.0%, and the tax is $"+total1$);//prints out the money netered in thousands, the percentage of tax and the tax total
                    
                }
                else if(40 > money){//if the int is less then 40, if not else
                    double total2$ = (int)((totalMoney*.07)*10)/10;//multiply by the assaigned rate and cast to an int to truncate
                    System.out.println("The tax rate on $"+money+",000 is 7.0%, and the tax is $"+total2$);//prints out the money netered in thousands, the percentage of tax and the tax total
                }
                else if(78 > money){//if the int is less then 78, if not else
                    double total3$ = (int)((totalMoney*.12)*10)/10;//multiply by the assaigned rate and cast to an int to truncate
                    System.out.println("The tax rate on $"+money+",000 is 12.0%, and the tax is $"+total3$);//prints out the money netered in thousands, the percentage of tax and the tax total
                }
                else {//if the int is greater than 78 
                    double total4$ = (int)((totalMoney*.14)*10)/10;//multiply by the assaigned rate and cast to an int to truncate
                    System.out.println("The tax rate on $"+money+",000 is 14.0%, and the tax is $"+total4$);//prints out the money netered in thousands, the percentage of tax and the tax total
                }
                }
            else{//did not pass the int greater than zero test
                System.out.println("You did not enter a positive int");//prints out error message
                return;//ends program    
            }
            }
        
        else{//did not pass int test
            System.out.println("You did not enter an int");//prints out error message
            return;//ends program
        }
        
    }
}
        