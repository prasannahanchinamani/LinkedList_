package stack_impl;

public class ValidParenthesesIntStack {
    public static boolean isValid(String s) {
        //own stack
        StackArray stack = new StackArray(s.length());
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if (ch == ')' && top != '(' ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[')
                    return false;
            }
        }
        return  stack.isEmpty();
    }
}
