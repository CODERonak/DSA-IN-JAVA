package Algorithms.LinearSearch;

// Linear search in a string
public class L2 {

    static boolean searchString(String str, char target) {
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "Software";
        char target = 'r';

        boolean isFound = searchString(str, target);

        if (isFound) {
            System.out.println("Character found");
        } else {
            System.out.println("Character not found");
        }
    }
}