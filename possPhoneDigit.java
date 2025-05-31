package recursion;
import java.util.ArrayList;

class possPhoneDigit {
    // Mapping of numbers to corresponding letters on the keypad
    static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };

    // Function to find the list of all words possible by pressing the given numbers
    static ArrayList<String> possibleWords(int a[], int N) {
        ArrayList<String> result = new ArrayList<>();
        
        // Edge case: if the input array is empty, return an empty list
        if (a == null || a.length == 0) {
            return result;
        }
        
        // Call the recursive backtracking function
        generateWords(a, 0, "", result);
        return result;
    }

    // Helper function to generate words using backtracking
    static void generateWords(int[] a, int index, String currentWord, ArrayList<String> result) {
        // Base case: If we have processed all digits, add the current word to the result
        if (index == a.length) {
            result.add(currentWord); // Add the generated word to the result list
            return;
        }

        // Get the possible letters for the current digit
        String letters = KEYPAD[a[index]];
        
        // Iterate over each letter for the current digit and recurse
        for (char letter : letters.toCharArray()) {
            generateWords(a, index + 1, currentWord + letter, result);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example input
        int[] input = {2, 3}; // Corresponds to letters "abc" and "def"
        int N = input.length;
        
        // Get possible words
        ArrayList<String> words = possibleWords(input, N);
        
        // Print the result
        for (String word : words) {
            System.out.println(word);
        }
    }
}
