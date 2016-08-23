package com.zik.zak.coder.ds.arrays;

/**
 * User of Array Data Structure Array01
 * 
 * @author balasuks
 *
 */
public class Array02_App {

  public static void main(String[] args) {

    Array02 intArray = new Array02(100);
    intArray.insert(10);
    intArray.insert(20);
    intArray.insert(30);
    intArray.insert(40);
    intArray.insert(50);
    intArray.insert(60);
    intArray.insert(70);
    intArray.insert(80);
    intArray.insert(90);
    intArray.insert(100);

    intArray.display();



    /** Search for a key **/
    int searchKey = 60;
    System.out.println("\nSearching for the key : " + searchKey);

    if (intArray.find(searchKey)) {
      System.out.println("Cant find the searchKey : " + searchKey);
    } else {
      System.out.println("found the searchKey: " + searchKey);
    }

    /** Delete a given key and move up the elements below **/
    searchKey = 60;
    System.out.println("\nDeleting the key : " + searchKey);

    intArray.display();

    if (intArray.delete(searchKey)) {
      System.out.println("Cant delete the searchKey : " + searchKey);
    } else {
      System.out.println("deleted the searchKey: " + searchKey);
    }

    intArray.display();
  }

}
