import java.util.Stack;

public class StringArrayStack {
    Stack<String> stack = new Stack<>();

    public String[] splitString(String str){
        return str.split("");
    }

    public void pushStringInToStack(String[] str){
        for (String value : str) {
            stack.push(value);
        }
    }

    public void pushBackStringToArray(String[] str){
        for (int i = 0; i < str.length; i++) {
            str[i] = stack.pop();
        }
    }

    public void displayArray(String[] str){
        for (String value : str) {
            System.out.print(value);
        }
    }
}
