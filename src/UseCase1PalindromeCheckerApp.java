import java.util.Scanner;
import java.util.Stack;
public class UseCase1PalindromeCheckerApp {

        /**
         * Application entry point.
         *
         * This is the first method executed by the JVM
         * when the program starts.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            System.out.println("==========================================");
            System.out.println("   Welcome to Palindrome Checker App");
            System.out.println("   Version 1.0");
            System.out.println("==========================================");
            System.out.println("Application started successfully.");
            System.out.println("Ready for next use case implementation.");

            /**
             * Application entry point for UC2.
             *
             * @param args Command-line arguments
             */

            // Data Structure: String
            String word = "madam";   // String Literal

            String reversed = "";

            // Reverse the string
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Conditional Statement (if-else)
            if (word.equals(reversed)) {

                // Console Output
                System.out.println(word + " is a Palindrome");

            } else {

                // Console Output
                System.out.println(word + " is Not a Palindrome");
            }

            /**
             * Application entry point for UC3.
             *
             * @param args Command-line arguments
             */

            // Original String (Hardcoded)
            String original = "level";

            // To store reversed string
            String reversed1 = "";

            // 1️⃣ Reverse string using for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed1 = reversed1 + original.charAt(i);  // String Concatenation
            }

            // 2️⃣ Compare original and reversed using equals()
            if (original.equals(reversed1)) {

                // 3️⃣ Display result
                System.out.println(original + " is a Palindrome");

            } else {

                System.out.println(original + " is Not a Palindrome");
            }




            /**
             * Application entry point for UC4.
             *
             * @param args Command-line arguments
             */


            // Original String
            // Create Scanner object for reading input (rinput)
            Scanner scanner = new Scanner(System.in);

            // Read input from user
            System.out.print("Enter a string: ");
            String rinput = scanner.nextLine();

            // Convert String to Character Array
            char[] characters = rinput.toCharArray();

            boolean isPalindrome = true;

            // Two-Pointer Approach
            int start = 0;
            int end = characters.length - 1;

            while (start < end) {

                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }

                start++;
                end--;
            }

            // Display Result
            if (isPalindrome) {
                System.out.println(rinput + " is a Palindrome");
            } else {
                System.out.println(rinput + " is Not a Palindrome");
            }

            // ================= UC5 =================

            Scanner scanner1 = new Scanner(System.in);

            System.out.print("Enter a string stack based: ");
            String input = scanner1.nextLine();

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            boolean isPalindromeUC5 = true;   // ✅ Renamed variable (fixed duplicate error)

            for (int i = 0; i < input.length(); i++) {

                char poppedChar = stack.pop();

                if (input.charAt(i) != poppedChar) {
                    isPalindromeUC5 = false;
                    break;
                }
            }

            if (isPalindromeUC5) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is Not a Palindrome");
            }

            scanner.close();
            scanner1.close();   // ✅ Fixed closing correct scanner
        }
        }


