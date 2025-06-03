// Evaluate Reverse Polish Notation
// You are given an array of strings tokens that represents a valid arithmetic expression in Reverse Polish Notation.
// Return the integer that represents the evaluation of the expression.
// The operands may be integers or the results of other operations.
// The operators include '+', '-', '*', and '/'. Assume that division between integers always truncates toward zero.
// Example 1: Input: tokens = ["1","2","+","3","*","4","-"]
// Output: 5. Explanation: ((1 + 2) * 3) - 4 = 5

package Stack;

import java.util.Stack;

public class Polishntn {

    public static void main(String[] args) {
        Polishntn c = new Polishntn();
        String[] tokens = { "1", "2", "+", "3", "*", "4", "-" };
        int res = c.pol(tokens);
        System.out.println("Result is " + res);
    }

    public int pol(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int a = stk.pop();
                int b = stk.pop();
                int result = 0;

                switch (s) {
                    case "+":
                        result = b + a;
                        break;
                    case "-":
                        result = b - a;
                        break;
                    case "*":
                        result = b * a;
                        break;
                    case "/":
                        result = b / a;
                        break;
                }

                stk.push(result);
            } else {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }

}
