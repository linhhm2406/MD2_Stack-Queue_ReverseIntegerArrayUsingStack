public class ReverseNumberArray {
    public static void main(String[] args) {
        reverseNumber();
        System.out.println();
        reverseString();
    }

    public static void reverseNumber(){
        NumberArrayStack numberArray = new NumberArrayStack();
        int[] array = {1,2,3,4,5};

        numberArray.pushInToStack(array);
        numberArray.pushBackNumberToArray(array);

        numberArray.displayArray(array);
    }

    public static void reverseString(){
        StringArrayStack strArray = new StringArrayStack();
        String str = "abcdefgh";
        String[] strAferSplit;

        strAferSplit = strArray.splitString(str);

        strArray.pushStringInToStack(strAferSplit);
        strArray.pushBackStringToArray(strAferSplit);

        strArray.displayArray(strAferSplit);
    }
}
