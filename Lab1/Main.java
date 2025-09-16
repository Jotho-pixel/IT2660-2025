//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Joshua Thomas
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    
    int[] x = {5,9,3,12,7,3,11,5};
    int i = 0;
    
    while (i < x.length){
      System.out.println(x[i]);
      i++;
    }

    for (i = x.length-1; i >= 0; i--){
      System.out.println(x[i]);
    }

    System.out.println("first " + x[0]);
    System.out.println("last " + x[x.length - 1]);
  
    Lab1.Max(1,2);
    Lab1.Min(8,4);
    Lab1.sum(x);
    Lab1.average(x);
    Lab1.Max(x);
    Lab1.Min(x);
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  static void  Max(int a, int b) {
    int max = a;
      
      if (max < b){
        max = b;
      }
    
    System.out.println("Max " + max);
  }

  static void Min(int a, int b){
    int min = a;
    if (min > b){
      min = b;
    }

    System.out.println("Min " + min);
  }

  static void sum(int[] nums){
    int sum = 0;
    for (int num : nums){
      sum += num;
    }

    System.out.println("Sum " + sum);
  }

  static void average(int[] nums){
    int sum =0;
    for (int num : nums){
      sum += num;
    }
    int avg = sum / nums.length;

    System.out.println("Average "+ avg);
  }

  static void Max(int[] nums){
    int max = nums[0];
    for (int i =0; i< nums.length -1; i++){
      if (max<nums[i]){
         max = nums[i];
      }
    }

    System.out.println("Max " + max);
  }

  static void Min(int[] nums){
    int min = nums[0];
    for(int i = 0; i < nums.length -1; i++){
      if (min > nums[i]){
        min = nums[i];
      }
    }

    System.out.println("Min " + min);
  }
}