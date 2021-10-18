package edu.toronto.csc207;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Yo");
        myList.add("Ho");
        myList.add("Mo");

// How does this work? How does Java keep track of all the details?
//        for (String s1 : myList) {
//            for (String s2 : myList) {
//                System.out.println(s1 + " " + s2);
//            }
//        }

        for (String s : myList) { // this is syntactic sugar for a while loop
            System.out.println(s);
        }

        // Check the quick-fix list for while and choose
        // "Replace with enhanced 'for'".
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for (int i = 0; i != blah; i++) {
//            // code goes here
//        }
//
//        int i = 0;
//        while (i != blah) {
//            // code goes here
//            i++;
//        }
    }
}