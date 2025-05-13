// Question:
// Given a string s, return true if it is a palindrome, otherwise return false.
// A palindrome is a string that reads the same forward and backward.
// It is also case-insensitive and ignores all non-alphanumeric characters.
// Example 1:
// Input: s = "Was it a car or a cat I saw?"
// Output: true
// Explanation:After considering only alphanumerical characters we 
// have "wasitacaroracatisaw", which is a palindrome.

public class Validpalindrome {
    public static void main(String[] args) {
        String s = "Was it a girl or a cat I saw?";
        Validpalindrome vp = new Validpalindrome();
        boolean result = vp.isPalindrome(s);
        System.out.println("Is the string a palindrome? " + result);
    }
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return false;

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = 0; i < cleaned.length(); i++) {
            reversed = cleaned.charAt(i) + reversed;
        }
        return cleaned.equals(reversed);
    }
}
