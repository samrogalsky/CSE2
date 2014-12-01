//Samuel Rogalsky
//October 31, 2014
//CSE 02
//Lab 10
//Method Calls Java Program - Write methods that call other methods that add numbers together
public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int getString(int a, int b){
        String c = ""+a;
        String d = ""+b;
        String finished = d + c;
        int input = Integer.parseInt(finished);
        return input;
    }
    public static int addDigit(int a, int b){
        int signA = 1;
        int signB = 1;
        if(a < 0){
            a = -a;
            signA = -1;
        }
        if(b < 0){
            b = -b;
            signB = -1;
        }
        int input = getString(a,b);
        input = input * signA * signB;
        return input;
    }
    public static int join(int a, int b){
        int input = addDigit(b,a);
        return input;
    }
}  
