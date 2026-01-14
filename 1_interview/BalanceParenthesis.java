import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) {
        String string = "{[]}";

        Stack<Character> stack = new Stack<>();

        for(char c : string.toCharArray()){
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) {
                    System.out.println("Not balanced");
                    return;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' 
                    && top != '{') || 
                    (c == ']' && top != '[') ) {

                        System.out.println("Not balanced");
                        return;
                }
            }
        }

        System.out.println(stack.isEmpty() ? "Balanced" : "Not balanced");

    }
}