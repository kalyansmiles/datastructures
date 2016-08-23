package com.zik.zak.coder.ds.arrays;

/**
 * User of Array Data Structure Array01
 * 
 * @author balasuks
 *
 */
public class Array01_App {

  public static void main(String[] args) {

    Array01 intArray = new Array01(100);
    intArray.setElement(0, 10);
    intArray.setElement(1, 20);
    intArray.setElement(2, 30);
    intArray.setElement(3, 40);
    intArray.setElement(4, 50);
    intArray.setElement(5, 60);
    intArray.setElement(6, 70);
    intArray.setElement(7, 80);
    intArray.setElement(8, 90);
    intArray.setElement(9, 100);

    int nElems = 10;
    int searchKey;
    int j;

    /** Display the Array **/
    for (int i = 0; i < nElems; i++) {
      System.out.println("intArray[" + i + "]=" + intArray.getElement(i));
    }

    /** Search for a key **/
    searchKey = 60;
    System.out.println("\nSearching for the key : " + searchKey);

    for (j = 0; j < nElems; j++) {
      if (intArray.getElement(j) == searchKey) {
        break;
      }
    }

    if (j == nElems) {
      System.out.println("Cant find the searchKey : " + searchKey);
    } else {
      System.out.println("searchKey: " + searchKey + " is found at the index :" + j);
    }

    /** Delete a given key and move up the elements below **/
    searchKey = 60;
    System.out.println("\nDeleting the key : " + searchKey);

    for (j = 0; j < nElems; j++) {
      if (intArray.getElement(j) == searchKey) {
        break;
      }
    }

    if (j < nElems) {
      for (int k = j; k < nElems; k++) {
        intArray.setElement(k, intArray.getElement(k + 1));
      }
      for (int k = 0; k < nElems - 1; k++) {
        System.out.println("intArray[" + k + "]=" + intArray.getElement(k));
      }
    } else {
      System.out.println("Cant find the searchKey : " + searchKey);
    }

  }

}
