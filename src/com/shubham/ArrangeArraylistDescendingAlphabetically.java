package com.shubham;

import java.util.ArrayList;
import java.util.Collections;

public class ArrangeArraylistDescendingAlphabetically {

    public static void main(String[] args) {
        ArrayList<String>
                list = new ArrayList<>();
        list.add("Shubham");
        list.add("Jitendra");
        list.add("Rahul");
        list.add("Vikas");
        list.add("Bread");
        list.add("Tea");
        list.add("Black");
        list.add("White");
        list.add("Niranjan");
        list.add("Mango");
        list.add("Apple");
        list.add("Peanuts");

        System.out.println("Unsorted ArrayList: "
                + list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Sorted ArrayList "
                + "in Alphabetically Descending order : "
                + list);
    }
}
