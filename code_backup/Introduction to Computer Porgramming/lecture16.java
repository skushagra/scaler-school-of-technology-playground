import java.util.Scanner;

public class lecture16 {

    // function to count vowels in a string
    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    //check if string is palindrome
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

    // check password strength
    public static boolean checkPassword(String s) {
        if (s.length() < 8) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
            if (ch == '@' || ch == '#' || ch == '$') {
                hasSpecialChar = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
            if (ch >= 'a' && ch <= 'z') {
                hasLowercase = true;
            }
        }
        return hasDigit && hasSpecialChar && hasUppercase && hasLowercase;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        // System.out.println(countVowels(s));;
        System.out.print(checkPassword(s));
        
    }
}