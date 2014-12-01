//Samuel Rogalsky
//November 30, 2014
//CSE 02
//Lab 13
//Ragged Array Java Program - fills ragged arrays and then sorts them using a bubble sort
public class RaggedArray {
    public static void main(String[] arg) {
        int[][] a = new int[5][];
        System.out.println("The array before sorting:");
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i * 3 + 5];
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random() * 40);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The array after sorting:");
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < a.length; i++) {
                for (int j = 1; j < a[i].length; j++) {
                    if (a[i][j - 1] > a[i][j]) {
                        int number = a[i][j];
                        a[i][j] = a[i][j - 1];
                        a[i][j - 1] = number;
                        swap = true;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}