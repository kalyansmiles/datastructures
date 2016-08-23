package com.zik.zak.coder.ds.arrays;

/**
 * Array Data Structure
 * 
 * @author balasuks
 *
 */
public class Array01 {

  private long[] arr;

  public Array01() {}

  public Array01(int size) {
    arr = new long[size];
  }

  public long getElement(int index) {
    return arr[index];
  }

  public void setElement(int index, long value) {
    arr[index] = value;
  }

}
