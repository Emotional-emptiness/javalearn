
public class For {
    public static void main(String[] args) {
        For cycles = new For();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("end");
        System.out.println("-----------");
        forMounth();
        System.out.println("end");
        System.out.println("-----------");
       // forEndless();
        forYear();
        System.out.println("end");
        System.out.println("-----------");
        forContinue();
        System.out.println("end");
        System.out.println("-----------");
        whileNumber();
        System.out.println("end");
        System.out.println("-----------");
        doWhile();
        System.out.println("end");
        System.out.println("-----------");
        forEach();
        System.out.println("end");
        System.out.println("-----------");
        forArray();
        System.out.println("end");
        System.out.println("-----------");
        System.out.println(cycles.isArrayContainsValue(new String[]{"serg", "anton","bobby"},"serg"));
        System.out.println("end");
        System.out.println("-----------");
        forWithCounter();
        System.out.println("end");
        System.out.println("-----------");
        forWithCounter2();
    }
    public static void forMounth(){
        int month = 1;

//Выведет числа от 1 до 12 включительно
        for(; month <= 12; month++) {
            System.out.println(month);
        }
    }
    public static void forEndless(){
        for (;;){
            System.out.println("this is endless");
        }
    }
    public static void forYear(){
        int year = 1900;
        for (;;){
            System.out.println(year);
            year++;
            if (year > 2000){
                break;
            }
        }
    }
    public static void forContinue(){
        for(int i = 1; i < 100; i++) {
            if (i%10 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void whileNumber(){
        int number = 1;
        while (number <= 100){
            System.out.println(number);
            number++;
        }
    }
    public static void doWhile(){
        int number1 = 1;
        do {
            System.out.println(number1);
            number1++;
        } while (number1 < 10);
    }
    public static void forEach() {
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        for (String season : seasons){
            System.out.println(season);
        }
    }
    public static void forArray(){
        int[] arr = new  int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        for (int i = 0; i < arr.length;i++ ){
            int newArr = arr[i];
            System.out.println(newArr);
        }
    }
    public boolean isArrayContainsValue(String[] names, String searchName) {
        for(String name: names) {
            if (name.equals(searchName)) {
                return true;
            }
        }

        return false;
    }
    public static void forWithCounter(){
        int[] numbers2 = {1, 2, 3, 4, 5};
        for(int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 1) {
                System.out.println(numbers2[i]); //Выведет 2, 4
            }
        }
    }
    public static void forWithCounter2(){
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0 ; i < numbers.length; i+= 2){
            System.out.println(numbers[i]);
        }
    }
}
