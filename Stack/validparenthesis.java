// Question: 

// Given a string s containing just the characters '(', ')', '{', '}', '[', and ']', determine if the input string is valid.

// A string is valid if:
// Open brackets are closed by the same type of brackets.
// Open brackets are closed in the correct order.
// Every closing bracket has a matching opening bracket before it.

package Stack;

import java.util.Stack;

public class validparenthesis {
    public static void main(String[] args) {
        String s = "({[]})"; // Example input string containing brackets
        System.out.println(isValid(s)); // This calls the isValid method and passes the string as an argument.

    }
    
    public static boolean isValid(String s)  // This creates a method that takes a string as input and returns a boolean value.
    {
        Stack<Character> stk = new Stack<>(); // This creates a stack of characters to keep track of the opening brackets.
        for (char ch : s.toCharArray())  // This converts the string into a character array and iterates through each character in the array.
        {
            if (ch == '(' || ch == '{' || ch == '[')  // This checks if the character is an opening bracket.
            {
                stk.push(ch); // If it is, it pushes the character onto the stack.
            } 
            else  // This checks if the character is a closing bracket.
            {
                if (stk.empty())  // This checks if the stack is empty.
                {
                    return false; // If it is, it means there is no matching opening bracket, so it returns false.
                }

                char top = stk.pop(); // This pops the top character from the stack, which should be the matching opening bracket.

                if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') // This checks if the closing bracket matches the opening bracket. 
                 {
                    return false; // If it doesn't, it returns false.
                }
            }
        }
        return stk.isEmpty(); // This checks if the stack is empty at the end. If it is, it means all opening brackets have been matched with closing brackets, so it returns true.
    }
}
