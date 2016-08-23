package com.zik.zak.coder.ds.arrays;

/**
 * Custom implementation of an Array if design in procedural way
 * 
 * @author balasuks
 *
 */
public class ArrayDemoProceduralVersion {

  public static void main(String[] args) {

    int[] intArray = new int[100];
    intArray[0] = 10;
    intArray[1] = 20;
    intArray[2] = 30;
    intArray[3] = 40;
    intArray[4] = 50;
    intArray[5] = 60;
    intArray[6] = 70;
    intArray[7] = 80;
    intArray[8] = 90;
    intArray[9] = 100;

    int nElems = 10;
    int searchKey;
    int j;

    /** Display the Array **/
    for (int i = 0; i < nElems; i++) {
      System.out.println("intArray[" + i + "]=" + intArray[i]);
    }

    /** Search for a key **/
    searchKey = 90;

    for (j = 0; j < nElems; j++) {
      if (intArray[j] == searchKey) {
        break;
      }
    }

    if (j == nElems) {
      System.out.println("Cant find the searchKey : " + searchKey);
    } else {
      System.out.println("searchKey: " + searchKey + " is found at the index :" + j);
    }

    /** Delete a given key and move up the elements below **/
    searchKey = 600;
    for (j = 0; j < nElems; j++) {
      if (intArray[j] == searchKey) {
        break;
      }
    }

    for (int i = j; i < nElems; i++) {
      intArray[i] = intArray[i + 1];
    }

    for (int i = 0; i < nElems - 1; i++) {
      System.out.println("intArray[" + i + "]=" + intArray[i]);
    }

  }

}
