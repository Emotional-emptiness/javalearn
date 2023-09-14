package OOP;

public class SearchUtil {
    public int findElement(int[] inputData, int elementToSearch) {
        int lowIndex = 0;
        int highIndex = inputData.length - 1;

        int midElement;

        return getMidElement(inputData, elementToSearch, lowIndex, highIndex);
    }

    private static int getMidElement(int[] inputData, int elementToSearch, int lowIndex, int highIndex) {
        while (lowIndex <= highIndex){
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = inputData[midIndex];
            if (midElement < elementToSearch){
                lowIndex = midIndex + 1;
            } else if (midElement > elementToSearch) {
                highIndex = midIndex - 1;
            } else {
                return midElement;
            }
        }
        return -1;
    }
}
