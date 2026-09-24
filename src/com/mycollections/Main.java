/**
 * Java program to create, modify, and delete TreeMap instance.
 */

package com.mycollections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<Double, Long> myMap = new TreeMap<>();

        // Display.
        System.out.println(myMap); // Output: {}

        // Add.
        myMap.put(2.1, 9000000000L);
        myMap.put(1.2, 80000000001L);
        myMap.put(3.4, 9111111111111L);
        myMap.put(7.4, 7777777666666L);
        myMap.put(3.2, 39222222222L);

        // Disolay.
        System.out.println(myMap); // Output: {1.2=80000000001, 2.1=9000000000, 3.2=39222222222, 3.4=9111111111111, 7.4=7777777666666}

        // Delete.
        myMap.remove(2.1);

        // Display.
        System.out.println(myMap); // Output: {1.2=80000000001, 3.2=39222222222, 3.4=9111111111111, 7.4=7777777666666}

        // Replace.
        myMap.replace(3.4, 22L);

        // Display.
        System.out.println(myMap); // Output: {1.2=80000000001, 3.2=39222222222, 3.4=22, 7.4=7777777666666}

        // Clear.
        myMap.clear();

        // Display.
        System.out.println(myMap); // Output: {}
    }
}