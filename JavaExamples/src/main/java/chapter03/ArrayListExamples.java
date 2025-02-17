package chapter03;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {

    public static void main(String[] args) {

        /* DECLARING ARRAYLISTS */

        // TODO: Declare an empty ArrayLists
        // elves, for data of type String
        // ages, for data of type Integer
        ArrayList<String> elves = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        /* ADDING ELEMENTS TO ARRAYLISTS */

        // TODO: Add elements to each of arraylists above

        // 4 well-known elves
        Collections.addAll(elves, "Legolas", "Arwen", "Elrond", "Galadriel");

        // 4 ages of elves above
        Collections.addAll(ages, 1,2,3,4);


        /* PRINTING ARRAYLISTS */

        // TODO: Print each arraylist
        System.out.println(elves);
        System.out.println(ages);


        /* USING ARRAYLIST & COLLECTIONS METHODS */

        // TODO: Print the size of elves
        int elvesSize = elves.size(); //.size(), not .length()
        System.out.println(elvesSize);

        // TODO: Check to see if ages contains 2901 and print the result
        System.out.println(ages.contains(2901));

        // TODO: Sort elves and then print it
        Collections.sort(elves);
        System.out.println(elves);


        // And now the ages of the elves are not in the same order...
        // We will fix this with HashMaps
    }
}
