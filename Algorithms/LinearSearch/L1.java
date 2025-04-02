package Algorithms.LinearSearch;

// Implementing simple linear search algorithm
public class L1 {
    
    static int linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 54, 786, 424, 22, 32, 11, 90 };

        int search = 32;

        int result = linearSearch(arr, search);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}