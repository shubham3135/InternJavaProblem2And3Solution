package com.shubham;

import java.util.ArrayList;
import java.util.Collections;

public class ArrangeArraylistDescendingAlphabetically {

    public static void main(String[] args) {
        ArrayList<String>
                list = new ArrayList<String>();

        // Populate the ArrayList
        list.add("Shubham");
        list.add("Jitendra");
        list.add("Rahul");
        list.add("Vikas");
        list.add("Bread");
        list.add("Tea");
        list.add("Black");
        list.add("White");
        list.add("Niranjan");


        System.out.println("Unsorted ArrayList: "
                + list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Sorted ArrayList "
                + "in Descending order : "
                + list);
    }
}
