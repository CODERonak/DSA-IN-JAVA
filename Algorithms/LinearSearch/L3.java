package Algorithms.LinearSearch;

// searching and printing the even numbers 
public class L3 {

    static void evenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Found " + arr[i] + " at index " + i);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 17, 93, 2, 58, 121, 45, 8 };
        evenNumbers(arr);
    }
}