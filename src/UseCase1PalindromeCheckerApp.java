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
        }
    }

