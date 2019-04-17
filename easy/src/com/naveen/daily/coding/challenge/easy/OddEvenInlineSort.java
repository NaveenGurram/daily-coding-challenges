package com.naveen.daily.coding.challenge.easy;

import java.util.Arrays;

/**
 * for given a integer array sort inline to swap all odd numbers to one side and even numbers to
 * another side
 */
public class OddEvenInlineSort {

  public static void main(String[] args) {
    int[] inputArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Before sort: " + Arrays.toString(inputArray));
    sortEvenOdd(inputArray);
    System.out.println("After sort: " + Arrays.toString(inputArray));
  }

  private static void sortEvenOdd(int[] inputArray) {
    int startIndex = 0;
    int endIndex = inputArray.length - 1;

    while (startIndex <= endIndex) {
      if (inputArray[startIndex] % 2 == 0 && inputArray[endIndex] % 2 != 0) {
        swap(inputArray, startIndex, endIndex);
        startIndex++;
        endIndex--;
      } else {
        if (inputArray[startIndex] % 2 != 0) {
          startIndex++;
        } else if (inputArray[endIndex] % 2 == 0) {
          endIndex--;
        }
      }
    }
  }

  private static void swap(int[] inputArray, int firstIndex, int secondIndex) {
    int temp = inputArray[firstIndex];
    inputArray[firstIndex] = inputArray[secondIndex];
    inputArray[secondIndex] = temp;
  }
}
