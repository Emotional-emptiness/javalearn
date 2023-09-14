package OOP;

public class OOPStyle {
    public static void main(String[] args) {
        int[] inputData = new int[] {-2, 20, -43, 30, -1, 0, 21, -99, -88, -31, 100, 120, 154};
        SortUtil sort = new SortUtil();
        SearchUtil search = new SearchUtil();

        int[] sortedArray = sort.sortIntArray(inputData);
        int result = search.findElement(sortedArray, 0);
        System.out.println("Element: " + result);

            // вывод отсортированного массива
//        System.out.print("Sorted Array: ");
//        for (int element : sortedArray) {
//            System.out.print(element + " ");
//        }
    }
}
