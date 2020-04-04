import java.util.Stack;

public class NumberArrayStack {
    Stack<Integer> stack = new Stack<>();

    public void pushInToStack(int[] arr){
        for (int value : arr) {
            stack.push(value);
        }
    }

    public void pushBackNumberToArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public void displayArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + ",");
        }
    }
}
