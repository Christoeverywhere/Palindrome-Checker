import java.util.*;

public class UseCase1PalindromeCheckerApp {

    static boolean twoPointer(String str) {
        String s = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean stackMethod(String str) {
        String s = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            stack.push(c);

        for (char c : s.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    static boolean recursion(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursion(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long start1 = System.nanoTime();
        boolean r1 = twoPointer(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = stackMethod(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean r3 = recursion(normalized, 0, normalized.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Result: " + r1 + " Time: " + (end1 - start1));
        System.out.println("Stack Method Result: " + r2 + " Time: " + (end2 - start2));
        System.out.println("Recursion Result: " + r3 + " Time: " + (end3 - start3));

        sc.close();
    }
}