import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
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


            System.out.print("Enter a string stack based: ");
            String input = scanner.nextLine();

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




            // ================= UC6 =================

            System.out.print("Enter a string(Stack and Queue Based): ");
            String input2 = scanner.nextLine();

            // Create Queue (FIFO)
            Queue<Character> queue = new LinkedList<>();

            // Create Stack (LIFO)
            Stack<Character> stack2 = new Stack<>();

            // 1️⃣ Enqueue and Push characters
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                queue.add(ch);     // Enqueue
                stack2.push(ch);    // Push
            }

            boolean isPalindrome2 = true;

            // 2️⃣ Compare dequeue vs pop
            while (!queue.isEmpty()) {

                char fromQueue = queue.remove();  // Dequeue (FIFO)
                char fromStack = stack2.pop();     // Pop (LIFO)

                if (fromQueue != fromStack) {
                    isPalindrome2 = false;
                    break;
                }
            }

            // 3️⃣ Print result
            if (isPalindrome2) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is Not a Palindrome");
            }




            /**
             * ============================================================
             * Use Case 7: Deque-Based Optimized Palindrome Checker
             * ============================================================
             *
             * Goal:
             * Use Deque to compare front and rear elements.
             *
             * Flow:
             * - Insert characters into deque
             * - Remove first & last
             * - Compare until empty
             *
             * Data Structure: Deque
             */


            // Read input using existing scanner
            System.out.print("Enter a string(Deque-Based) ");
            String input3 = scanner.nextLine();

// Create Deque (Double Ended Queue)
            Deque<Character> deque2 = new LinkedList<>();

// Insert characters into deque
            for (int i = 0; i < input3.length(); i++) {
                deque2.addLast(input3.charAt(i));
            }

            boolean isPalindrome3 = true;

// Remove first & last and compare
            while (deque2.size() > 1) {

                char front2 = deque2.removeFirst();
                char rear2 = deque2.removeLast();

                if (front2 != rear2) {
                    isPalindrome3 = false;
                    break;
                }
            }

// Print result
            if (isPalindrome3) {
                System.out.println(input2 + " is a Palindrome");
            } else {
                System.out.println(input2 + " is Not a Palindrome");
            }
            scanner.close();// ✅ Fixed closing correct scanner
        }
        }


