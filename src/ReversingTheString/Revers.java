package ReversingTheString;

public class Revers {
    public static void main(String[] args) {
        String reversed = reverseStringWithNewObject("Hello World");
        System.out.println(reversed);

        String reversed1 = reverseStringWithoutAdditionalMemoryUsage("Hello World");
        System.out.println(reversed1);


        // далее StringBuilder и StringBuffer
        String builderReverse = stringBuilderReverseExample("Hello World");
        System.out.println("builderReverse = " + builderReverse);
    }

    private static String stringBuilderReverseExample(String input) {
        StringBuilder builder = new StringBuilder();
        // есть еще StringBuffer, но он работает с многопоточной средой
        //  и за счет этого немного медленнее StringBuilder
        String result = builder.append(input).reverse().toString();
        return result;
    }

    private static String reverseStringWithoutAdditionalMemoryUsage(String input) {
        char[] inputArray = input.toCharArray();
        int begin = 0;
        int end = inputArray.length - 1;
        char temp;
        while (begin < end) {
            temp= inputArray[begin];
            inputArray[begin] = inputArray[end];
            inputArray[end] = temp;
            begin++;
            end--;
        }
        return new String(inputArray);
    }

    private static String reverseStringWithNewObject(String input) {
        char[] inputChars = input.toCharArray();
        char[] result = new char[inputChars.length];

        for ( int i = 0; i < inputChars.length; i++) {
            result[i] = inputChars[inputChars.length - 1 - i];
        }
        return new String(result);
    }
}
