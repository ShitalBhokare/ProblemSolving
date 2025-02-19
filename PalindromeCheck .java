import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
