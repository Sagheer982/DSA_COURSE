import java.util.Stack;
public class Task_2 {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop(); 
                if (!isMatchingPair(top, ch)) {
                    return false; 
                }
            }
        }   
        return stack.isEmpty(); 
    }
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
    public static void main(String[] args) {
        String str = "{9(y+z}"; // Example with an unmatched bracket
        System.out.println(str);
        System.out.println(isBalanced(str)); // Output: false

        String str2 = "({[a+b]+c}-1)"; // Example with balanced brackets
        System.out.println(str2);
        System.out.println(isBalanced(str2)); // Output: true
    }
}
