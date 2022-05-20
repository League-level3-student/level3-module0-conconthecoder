package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	static Random gen = new Random();
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    		String[] dog = new String[5];
    
        // 2. print the third element in the array
    		System.out.println(dog[2]);
        // 3. set the third element to a different value
    		dog[2] = "hello";
        // 4. print the third element again
    		System.out.println(dog[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    		for (int i = 0; i<dog.length; i++) {
    			dog[i] = "Mike";
    		}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    		for (String i: dog) {
    			System.out.println(i);
    		}
        // 7. make an array of 50 integers
    		int[] nums = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    		for (int i =0; i< nums.length; i++) {
    			nums[i] = gen.nextInt(30);
    		}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    		int g = 30;
    		for (int i: nums) {
    			g = Math.min(g, i);
    		}
    		System.out.println(g);
        // 10 print the entire array to see if step 8 was correct
    		System.out.println("--------------------");
    		for (int i: nums) {
    			System.out.println(i);;
    		}
    		System.out.println("--------------------");
        // 11. print the largest number in the array.
    		int l = 0;
    		for (int i: nums) {
    			l = Math.max(l, i);
    		}
    		System.out.println(l);
        // 12. print only the last element in the array
    		System.out.println(nums[49]);
    }
}
