// generics // 2d array // messing wit um
// make a generic random

import java.util.Scanner;
import java.util.random.*;
public class Java_calc_2 {
    public static void main(String args[]) {

        // generics
	  
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B","Y","E"};
        
        System.out.print("Integer Array: ");
        displayArray(intArray);
        System.out.println(firstIndex(intArray));
  
        System.out.print("Double Array: ");
        displayArray(doubleArray);
        System.out.println(firstIndex(doubleArray));
  
        System.out.print("Character Array: ");
        displayArray(charArray);
        System.out.println(firstIndex(charArray));
        
        System.out.print("String Array: ");
        displayArray(stringArray);
        System.out.println(firstIndex(charArray));

        kkik(intArray, doubleArray);

        System.out.println();

        // 2d array

        Integer[][] intArray_1 = new Integer[3][3];
        Double[][] doubleArray_1 = new Double[3][3];
        Character[][] charArray_1 = new Character[3][3];
        String[][] stringArray_1 = new String[3][3];

        // int array
        intArray_1[0][0] = 1; intArray_1[0][1] = 2; intArray_1[0][2] = 3;
        intArray_1[1][0] = 11; intArray_1[1][1] = 22; intArray_1[1][2] = 33;
        intArray_1[2][0] = 111; intArray_1[2][1] = 222; intArray_1[2][2] = 333;

        // double array
        doubleArray_1[0][0] = 1.1; doubleArray_1[0][1] = 2.2; doubleArray_1[0][2] = 3.3;
        doubleArray_1[1][0] = 1.11; doubleArray_1[1][1] = 2.22; doubleArray_1[1][2] = 3.33;
        doubleArray_1[2][0] = 1.111; doubleArray_1[2][1] = 2.222; doubleArray_1[2][2] = 3.333;

        // char array
        charArray_1[0][0] = 'A'; charArray_1[0][1] = 'B'; charArray_1[0][2] = 'C';
        charArray_1[1][0] = 'a'; charArray_1[1][1] = 'b'; charArray_1[1][2] = 'c';
        charArray_1[2][0] = '1'; charArray_1[2][1] = '2'; charArray_1[2][2] = '3';

        // String array
        stringArray_1[0][0] = "APPLE"; stringArray_1[0][1] = "BANANA"; stringArray_1[0][2] = "CAT";
        stringArray_1[1][0] = "apple"; stringArray_1[1][1] = "banana"; stringArray_1[1][2] = "cat";
        stringArray_1[2][0] = "10101"; stringArray_1[2][1] = "101010"; stringArray_1[2][2] = "101";

        // printing

        p_2d_array_p(intArray_1);

        p_2d_array_p(doubleArray_1);

        p_2d_array_p(charArray_1);

        p_2d_array_p(stringArray_1);

        p_2d_array_flip(charArray_1);

        p_2d_array_c(stringArray_1, 0);

        p_2d_array_c(stringArray_1, 1);

        p_2d_array_c(stringArray_1, 2);

        p_2d_array_r(stringArray_1, 0);

        p_2d_array_r(stringArray_1, 1);

        p_2d_array_r(stringArray_1, 2);

        p_2d_array_diagonal(stringArray_1, 0);

        p_2d_array_diagonal(stringArray_1, 1);

        // calculations 

        Integer[][] intArray_2 = {{123 , 1234 , 12345} , {112233 , 11223344 , 1122334455} , {111222333 , 111222 , 111}};
        Integer[][] intArray_3 = {{321 , 4321 , 54321} , {332211 , 44332211 , 554433221} , {333222111 , 222111 , 111}};

        p_2d_array_add(intArray_2, intArray_3);


        
    }
     
    //////////
    // Generic method
    public static <Thing> void displayArray(Thing[] array) {
  
        for(Thing x : array) {
           System.out.print(x+" ");
        }
        System.out.println();
    }
    
    // Generic method with generic return type 
    public static <Thing> Thing firstIndex(Thing[] array) {
  
        return array[0];
    }

    public static <Thing> void kkik(Thing[] array1, Thing[] array2) {
  
        System.out.println(array1[0].getClass().getName()   + " = " + array1[0]);

        System.out.println(array2[0].getClass().getName()   + " = " + array2[0]);
        
    }
    //////////

    //////////
    public static <Thing> void p_2d_array_pe(Thing[][] array) { // prints everything
  
        for (int i = 0; i < array.length; i++) {
            for (int index = 0; index < array[i].length; index++) {
                System.out.print(" " + array[i][index]);
            }
        }
        System.out.println();
    }

    public static <Thing> void p_2d_array_p(Thing[][] array) { // prints everything but in row colum
  
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j< array[i].length) {
                System.out.print(array[i][j] +  " " );
                j++;
            }
            System.out.println();
        }
        System.out.println( );
    }

    public static <Thing> void p_2d_array_flip(Thing[][] array) { // do a flip
  
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j< array[i].length) {
                System.out.print(array[j][i] + " ");
                j++;
            }
            System.out.println();
        }
        System.out.println( );
    }

    public static <Thing> void p_2d_array_r(Thing[][] array , int ak) { // prints everything but in selected row
      
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[ak][i] + " ");
        }
        System.out.println();
        System.out.println();
        
    }

    public static <Thing> void p_2d_array_c(Thing[][] array , int ak) { // prints everything but in selected colum
      
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][ak] + " ");
        }
        System.out.println();
        
    }

    public static <Thing> void p_2d_array_c(Thing[][] array , int ak) { // prints everything but in selected colum
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][ak] + " ");
        }
        System.out.println();
        
    }

    public static <Thing> void p_2d_array_diagonal(Thing[][] array , int ak) { // prints everything but in diagonal (0 = \) (1 = /)

        if (ak == 0) {
            int nk = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i][nk++] + " ");
            }
            System.out.println();
            System.out.println();
        }

        if (ak == 1) {
            int nk = array.length-1;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i][nk--] + " ");
            }
            System.out.println();
            System.out.println();
        }
        
    }

    ////////////////////

    ////////////////////

    public static <Thing1 , Thing2> void p_2d_array_add(Thing1[][] array1 , Thing2[][] array2) { // adds 2 arrays togather and prints the sum
  
        Integer[][] arraysum = new Integer[array1.length][array2.length];
        Integer[][] comboi1 = new Integer[array1.length][array2.length]; 
        Integer[][] comboj1 = new Integer[array1.length][array2.length]; 
        int comboi;
        int comboj;

        comboi1 = array1;
        comboj1 = array2;

       if (array1.length != array2.length && array1[0].length != array2[0].length) {
            System.out.println("!!!! NOT GONNA WORK !!!!");
       }
       else if (array1.length == array2.length && array1[0].length == array2[0].length) {
           
            int j = 0;
            
            //Thingk combok = new Thingk();

            for (int i = 0; i < arraysum.length; i++) {
                for (int index = 0; index < arraysum.length; index++) {
                    comboi = comboi1[i][index];
                    comboj = comboj1[i][index];
                    arraysum[i][index] = comboi + comboj; 
                }
            }

       }else{}
       //return arraysum;
    }
}

//     0 1 2 3 4       ---------
//   0 X X X X X       X X X X X     | X X X X X 
//   1 X X X X X       X X X X X     | X X X X X
//   2 X X X X X       X X X X X     | X X X X X 
//   3 X X X X X       X X X X X     | X X X X X
//   4 X X X X X       X X X X X     | X X X X X 