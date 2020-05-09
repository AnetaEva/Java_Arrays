/*
Project: Lab 5
Purpose Details: Learn how to use Arrays
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 2/15/2020
Last Date Changed:
Revision:
*/

package edu.psu.abington.ist.ist242;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //SECTION 1: Array of Integers, Reverse Sort, Print elements values using for loop
        /*Declare an array of integers named intArray and allocate memory for 5 integer types
        Initialize the array elements with integer values (100, 1000, 23, 555, 356) using the Integer type not int.
        Reverse sort the array intArray elements and print each array element out using iteration (loop)
        You will need to import the Collections class and Arrays class to perform the reverse sort.*/

        Integer[] intArray; // Declare an array of integers named intArray
        intArray = new Integer[5]; // and allocate memory for 5 integer types
        intArray[0] = 100; // initialize the array elements with values (100,
        intArray[1] = 1000; // 1000,
        intArray[2] = 23; // 23,
        intArray[3] = 555; // 555
        intArray[4] = 356; // 356
        //ALTERNATIVE: Integer[] intArray={100, 1000, 23, 555, 356};

        // Reverse sort the array intArray elements
        Arrays.sort(intArray, Collections.reverseOrder()); //Arrays.sort(): sorts an array of integers in ascending order, intArray is the declaration, Collections.reverseOrder = reverse the array
        for (int i = 0; i < intArray.length; i++) { // initialize i at 0; index 0 is less than the length of array, increment the index
            System.out.println(intArray[i]); // print each array element out using iteration (loop)
        }    //i starts with 0 as array index starts with 0 too

        // -------------------------------------------------------------------------------------------------------------
        System.out.println("");
        //SECTION 2: Array of chars, Sort, Print elements values using a for loop
        /*Declare an array of chars named charArray and allocate memory for 5 char types
        Initialize the array elements with char values (characters G, E, Q, A, Z)
        Sort the array charArray elements and print each element out using iteration (loop)
         */

        char[] charArray; // Declare an array of chars named charArray
        charArray = new char[5];
        charArray[0] = 'G';
        charArray[1] = 'E';
        charArray[2] = 'Q';
        charArray[3] = 'A';
        charArray[4] = 'Z';
        //ALTERNATIVE: char[] charArray = {"G", "E", "Q", "A", "Z"};

        Arrays.sort(charArray); // sorts the charArray in Ascending Order
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("");
        //SECTION 3: Array of floats, Sort, Print elements values using a for loop
        /* Declare an array of floats named floatArray and allocate memory for 5 floats
        Initialize the array elements with float values (10.0, 32.5, 22.2, 99.1, 90.5)
        Sort the array floatArray elements and print each element out using iteration (loop)
         */

        float[] floatArray; // Declare an array of floats named floatArray
        floatArray = new float[5]; // Allocate memory for 5 floats
        floatArray[0] = 10.0f; // Initialize the array elements with float values / f is used to tell the compiler that this is a float number
        floatArray[1] = 32.5f;
        floatArray[2] = 22.2f;
        floatArray[3] = 99.1f;
        floatArray[4] = 90.5f;
        //ALTERNATIVE: float[] floatArray = {10.0f, 32.5f, 22.2f, 99.1f, 90.5f};

        Arrays.sort(floatArray); // sort the array
        for (int i = 0; i < floatArray.length; i++){ // for each integer i index at 0; index starts at 0 < the length of the array; then increments and prints and loops again until index is more than the length then becomes false
            System.out.println(floatArray[i]); // prints the array at each index
        }

        // -------------------------------------------------------------------------------------------------------------
        System.out.println("");
        //SECTION 4: Multidimensional array, Print elements values using a for loop
        /* Declare a multidimensional array of integers named multiArray and allocate memory for 3 X 5 integers
        Initialize the array elements with int values (row 1 = 1,2,3,4,5,
                                                       row 2 = 11,12,13,14,15,
                                                       row 3 = 21,22,23,24,25)
        Print each row element out using a nested loop
         */

        Integer[][] multiArray;
        multiArray = new Integer[3][5]; // 3 is rows ; 5 is columns
        multiArray[0][0] = 1;
        multiArray[0][1] = 2;
        multiArray[0][2] = 3;
        multiArray[0][3] = 4;
        multiArray[0][4] = 5;

        multiArray[1][0] = 11;
        multiArray[1][1] = 12;
        multiArray[1][2] = 13;
        multiArray[1][3] = 14;
        multiArray[1][4] = 15;

        multiArray[2][0] = 21;
        multiArray[2][1] = 22;
        multiArray[2][2] = 23;
        multiArray[2][3] = 24;
        multiArray[2][4] = 25;
        //ALTERNATIVE: int multiArray[][]={{1,2,3,4,5},{11,12,13,14,15},{21,22,23,24,25}};

        for (int row = 0; row < multiArray.length; row++){ //if you want to loop through the first array you ask for "multiArray.length" to return rows
            for (int column = 0; column < multiArray[0].length; column++){ // if you want to loop through the second array you ask for "multiArray[0].length" to return columns
                System.out.println(multiArray[row][column]);
            }
        }
    }
}
