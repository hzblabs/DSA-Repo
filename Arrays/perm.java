import java.util.Arrays;

public class perm {
    public static void main(String[] args) {
        perm p = new perm();
        String s1 = "haz";
        String s2 = "Biohazard";

        System.out.println("S2 has a permutation of s1: " + p.per(s1, s2));
    }

    public boolean per(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] s1count = new int[26];
        int[] countt = new int[26];

        for (char c : s1.toCharArray()) {
            s1count[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            countt[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                countt[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (Arrays.equals(s1count, countt)) {
                return true;
            }
        }
        return false;
    }
}
