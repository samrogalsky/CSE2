//Samuel Rogalsky  
//December 5, 2014
//CSE 02
//Hw11
//Matrix Sorter Program - randomly generates a 3d array of set lengths but random values, finds the lowest entry, and then sorts the 3rd slab of that 3d aray
public class MatrixSorter {
    public static void main(String arg[]) {//main mehtod that calls the building of the array, the printing of the array, the minimum finding and the sorting, and then the printing of that array
        int mat3d[][][];
        mat3d = buildMat3d();//calls buildMat3d method
        show(mat3d);//calls show method
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));//calls findMin method
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);//calls sort method on the 2nd slab of the 3d array
        show(mat3d);//calls show method
    }
    public static int[][][] buildMat3d() {//method buildMat3d that builds the 3d array, fills it, and returns it back to the main method
        int[][][] matrix = new int[3][][];
        for (int i = 0; i < matrix.length; i++) {//for loop that cycles through the slavs, initilizing the number of rows in each slab
            matrix[i] = new int[3 + 2 * i][];
        }
        for (int i = 0; i < matrix.length; i++) {//for loop that cylces through the slabs
            for (int j = 0; j < matrix[i].length; j++) {//for loop that cycles through each row of the slab and initliazes the length of each row
                matrix[i][j] = new int[i + j + 1];
            }
        }
        for (int i = 0; i < matrix.length; i++) {//for loop that cylces through the slabs
            for (int j = 0; j < matrix[i].length; j++) {//for loop that cycles through each row of the slab
                for (int k = 0; k < matrix[i][j].length; k++) {//for loop that cycles through each entry of the row of the slab
                    matrix[i][j][k] = (int)(((Math.random()) * 99) + 1);//gets a number between 1 and 99
                }
            }
        }
        return matrix;
    }
    public static void show(int x[][][]) {//method show that prints the passed 3d array
        String slab[] = {
            "Slab 1", "Slab 2", "Slab 3"
        };
        for (int i = 0; i < x.length; i++) {//for loop that cylces through the slabs
            System.out.print("---------------------------");
            System.out.println(slab[i]);
            for (int j = 0; j < x[i].length; j++) {//for loop that cycles through each row of the slab
                for (int k = 0; k < x[i][j].length; k++) {//for loop that cycles through each entry of the row of the slab
                    System.out.print(x[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("---------------------------");
        return;
    }
    public static int findMin(int x[][][]) {//mehtod findMin that returns an int that is the smallest member in the whole passed 3d array
        int min = x[0][0][0];//sets the key to the first value
        for (int i = 0; i < x.length; i++) {//for loop that cylces through the slabs
            for (int j = 0; j < x[i].length; j++) {//for loop that cycles through each row of the slab
                for (int k = 0; k < x[i][j].length; k++) {//for loop that cycles through each entry of the row of the slab
                    if (x[i][j][k] < min) {
                        min = x[i][j][k];//change the key
                    }
                }
            }
        }
        return min;
    }
    public static void sort(int x[][]) {//method sort that sorts the passed in 2D array 
        for (int i = 0; i < x.length; i++) {//for all rows in the 2d array, 
            sortRow(x[i]);//call sortRow on each row, sending in a 1d array
        }
        for (int i = 1; i < x.length; i++) {//goes through each row of the array minus the first one, starts the insertion sort
            int[] z = x[i];
            int key = x[i][0];
            int j = i;
            while (j > 0 && x[j - 1][0] > key) {
                x[j] = x[j - 1];//swaps the rows
                j--;
            }
            x[j] = z;
        }
    }
    public static void sortRow(int x[]) {//method sortRow that takes in a 1d array and sorts it using a selection sort
        for (int i = 0; i < x.length - 1; i++) {//cycles through all of aray of x but the last one
            int min = x[i];
            int index = i;
            for (int j = i + 1; j < x.length; j++) {//cycles through all of array of x but i+1 of it
                if (min > x[j]) {
                    min = x[j];
                    index = j;
                }
            }
            if (index != i) {
                x[index] = x[i];
                x[i] = min;
            }
        }
        return;
    }
}