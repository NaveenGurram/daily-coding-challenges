package com.naveen.daily.coding.challenge.easy;

import java.util.HashSet;
import java.util.Set;


/**
 * <p>This problem was recently asked by Google.
 *
 * <p>Given a list of numbers and a number k, return whether any two numbers from the list add up to
 * k.
 *
 * <p>For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * <p>Bonus: Can you do this in one pass?
 */
public class AddUptoK {
  // runtime - o(n), space - o(n)
  public static void main(String[] args) {
    int numbers[] = new int[] {10, 15, 3, 7};
    int k = 17;
    System.out.println(checkAddUptoK(numbers, k));
  }

  private static boolean checkAddUptoK(int[] numbers, int k) {
    Set dictionary = new HashSet();
    for (int i = 0; i < numbers.length; i++) {
      if(dictionary.contains(k-numbers[i])){
         return true;
      }else{
        dictionary.add(numbers[i]);
      }
    }
    return false;
  }
}
