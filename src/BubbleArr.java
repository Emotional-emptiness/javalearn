import java.util.Arrays;

public class BubbleArr {


    public static void main(String[] args) {
        int[] array = {21, 2154, 12, 4, 2, 321, 3, 50, 100, 32, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("end");
        System.out.println("-----");
        arraySort2();
        System.out.println("end");
        System.out.println("-----");
        bubbleSort();
        System.out.println("this is bubble sort");

    }
    public static void arraySort2(){
        int[] numbers = {3, 1, 7};  //Исходный массив

        Arrays.sort(numbers); //Сортируем

//Выведет 1, 3, 7
        for(int num: numbers) {
            System.out.println(num);
        }
    }
    public static void bubbleSort(){
        int [] arr = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
