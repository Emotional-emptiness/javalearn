package OOP;

public class ProceduraStyleNotOop {
    public static void main(String[] args) {
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, -88, -31, 100, 120, 154};
        int element = sortAndFindElement(inputData, 0);
        System.out.println("element = " + element);
    }

    private static int sortAndFindElement(int[] inputData, int elementToSerch) {
        for (int i = 0; i < inputData.length - 1; i++){
            for (int j = 0; j < inputData.length - i - 1; j++) {
                if (inputData[j] > inputData[j + 1]) {
                    int temp = inputData[j];
                    inputData[j] = inputData[j + 1];
                    inputData[j + 1] = temp;
                }
            }
        }
        // DRY - don't repeat yourself
        // KISS - keep it simple, stupid

        int lowIndex = 0;
        int highIndex = inputData.length - 1;

        while (lowIndex <= highIndex){
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = inputData[midIndex];
            if (midElement < elementToSerch){
                lowIndex = midIndex + 1;
            } else if (midElement > elementToSerch) {
                highIndex = midIndex - 1;
            } else {
                return midElement;
            }
        }

        return -1;
    }
}
