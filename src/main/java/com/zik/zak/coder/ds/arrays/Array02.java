package com.zik.zak.coder.ds.arrays;

/**
 * Array Data Structure
 * 
 * @author balasuks
 *
 */
public class Array02 {

  private long[] array;
  private int nElems = 0;

  public Array02() {}

  public Array02(int size) {
    array = new long[size];
  }

  public void insert(long value) {
    array[nElems] = value;
    nElems++;
  }

  public boolean find(long searchKey) {
    int i;
    for (i = 0; i < nElems; i++) {
      if (searchKey == array[i]) {
        break;
      }
    }
    if (i == nElems)
      return false;
    else
      return true;
  }

  public boolean delete(long searchKey) {
    int i;
    for (i = 0; i < nElems; i++) {
      if (searchKey == array[i]) {
        break;
      }
    }

    // System.out.println("A i=" + i);
    // System.out.println("A nElems=" + nElems);
    if (i == nElems) {
      // System.out.println("B nElems=" + nElems);
      return false;
    } else {
      // System.out.println("C nElems=" + nElems);
      for (int j = i; j < nElems; j++) {
        array[j] = array[j + 1];
      }
      nElems--;
      // System.out.println("D nElems=" + nElems);
      return true;
    }
  }

  public void display() {
    for (int i = 0; i < nElems; i++) {
      System.out.println("array[" + i + "]=" + array[i]);
    }
  }
}
