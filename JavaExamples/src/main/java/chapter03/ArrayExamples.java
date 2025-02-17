package chapter03;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        /* DECLARING AN EMPTY ARRAY */

        // TODO: Declare an empty Array, hobbits, that can hold 8 elements of type String
        String[] hobbits = new String[8];

        // TODO: Add 4 Hobbits at different indices
        hobbits[0] = "swimming";
        hobbits[2] = "reading";
        hobbits[3] = "riding";
        hobbits[7] = "singing";

        // TODO: Print an element at an index with an unassigned value
        System.out.println(hobbits[1]); //null

        // TODO: Print the array by name — what happens?
        // System.out.println(hobbits); //location in memory

        // TODO: Use Arrays.toString() to print the array's contents
        System.out.println(Arrays.toString(hobbits));

        /* INITIALIZING AN ARRAY WITH VALUES */

        // TODO: Declare an array of integers, fellowship, representing the members of the Fellowship
        // wizards, hobbits, elves, dwarves, men
        int[] fellowship = {1,2,3,4,5};

        // TODO: Print a sentence with the number of men
        System.out.println("The number of men is " + fellowship[4]);
        System.out.println("The number of men is " + fellowship[fellowship.length-1]);

        // TODO: Print the array elements using Arrays.toString()
        System.out.println(Arrays.toString(fellowship));

    }
}
