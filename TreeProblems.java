/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *     Philip Garbis   /  COMP 272-002
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    
    // Create copies of the input sets to avoid modifying the originals
    Set<Integer> tempA = new TreeSet<>(setA); // Copy of setA
    Set<Integer> tempB = new TreeSet<>(setB); // Copy of setB

    // Remove all elements from tempA that also exist in setB
    tempA.removeAll(setB);

    // Remove all elements from tempB that also exist in setA
    tempB.removeAll(setA);

    // Merge the results: tempA now contains elements unique to setA,
    // and tempB contains elements unique to setB.
    tempA.addAll(tempB);

    // Return the resulting TreeSet containing the symmetric difference
    return tempA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    // Use an iterator to safely remove elements while iterating
    Iterator<Integer> iterator = treeMap.keySet().iterator();

    while (iterator.hasNext()) {
        // Get the next key in the TreeMap
        if (iterator.next() % 2 == 0) { // Check if the key is even
            iterator.remove(); // Remove the key-value pair from the TreeMap
        }
    }
    
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    // Use the built-in equals() method for an efficient comparison
    return tree1.equals(tree2);
  }

} // end treeProblems class
