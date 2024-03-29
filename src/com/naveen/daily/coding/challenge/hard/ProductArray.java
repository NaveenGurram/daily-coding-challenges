package com.naveen.daily.coding.challenge.hard;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 *
 * <p>Given an array of integers, return a new array such that each element at index i of the new
 * array is the product of all the numbers in the original array except the one at i.
 *
 * <p>For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30,
 * 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class ProductArray {
  public static void main(String[] args) {
    int input[] = new int[] {1,2,3,4,5};
    int output[] = productArray(input);
    int optimizedSolutionOutput[] = productArrayWithoutDivision(input);
    System.out.println(Arrays.toString(input));
    System.out.println(Arrays.toString(output));
    System.out.println(Arrays.toString(optimizedSolutionOutput));
    System.out.println(Arrays.toString(productArrayLinearWithoutUsingDivision(input)));
  }
  // runtime o(n) + o(n) = o(2n) , o(1) space for sum, then o(n) for output array
  private static int[] productArray(int[] input) {
    int output[] = new int[input.length];
    int sum = 1;
    for (int i = 0; i < input.length; i++) {
      sum *= input[i];
    }
    for (int i = 0; i < input.length; i++) {
      output[i] = sum / input[i];
    }
    return output;
  }
  // complexity  runtime= o(n2) space=o(n)
  private static int[] productArrayWithoutDivision(int[] input){
    int output[] = new int[input.length];
    int previousSum = 1;
    for(int i=0;i<input.length;i++){
      int sum = 1;
      for(int j=i+1;j<input.length;j++){
        sum *= input[j];
      }
      output[i] = sum * previousSum;
      previousSum *= input[i];
    }
    return output;
  }

  private static int[] productArrayLinearWithoutUsingDivision(int[] input){
    int[] productToLeft = new int[input.length];
    int[] productToRight = new int[input.length];

    productToLeft[0] = 1;
    // o(n) , o(n) space
    for(int i=1;i<input.length;i++){
      productToLeft[i] = productToLeft[i-1] * input[i-1];
    }

    productToRight[input.length-1]=1;
    // o(n), o(n) space
    for(int i=input.length-2;i>=0;i--){
      productToRight[i] = productToRight[i+1] * input[i+1];
    }
    // o(n)
    for(int i=0;i<input.length;i++){
      productToLeft[i] *= productToRight[i];
    }
    // total o(3n) ~ o(n) complexity
    // total o(2n) ~ o(n) space
    return productToLeft;
  }


}
