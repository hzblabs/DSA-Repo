// Question
// Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

import java.util.ArrayList;
import java.util.List;

public class Endec {
    public static void main(String[] args) {
        Endec endec = new Endec();
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        String encoded = endec.encode(strings);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = endec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
    // Encodes a list of strings to a single string.
    public String encode(List<String> a) {
        if (a.isEmpty())
            return "";

        StringBuilder b = new StringBuilder();
        for (String c : a) {
            b.append(c.length()).append(','); 
        }
        b.append('#'); 
        for (String c : a) {
            b.append(c); 
        }
        return b.toString(); 

    }
    // Decodes a single string to a list of strings.
    public List<String> decode(String a) {
        if (a.length() == 0) return new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();

        int i = 0;
        // Extract lengths of strings
        while (a.charAt(i) != '#') {
            StringBuilder f = new StringBuilder();
            while (a.charAt(i) != ',') {
                f.append(a.charAt(i));
                i++;
            }
            numbers.add(Integer.parseInt(f.toString())); // Parse the length
            i++; 
        }
        i++; // Skip the '#'

        // Extract the actual strings
        for (int g : numbers) {
            words.add(a.substring(i, i + g)); 
            i += g; 
        }
        return words; 
    }
}
