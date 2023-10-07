//
//Учитывая массив целых чисел «nums» и целое число «цель», верните индексы двух чисел так, чтобы их сумма составляла «цель».
//
//        Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
//
//        Вы можете вернуть ответ в любом порядке.
//
//        Пример:
//
//        Ввод: nums = [2,7,11,15], target = 9
//        Вывод: [0,1]
//        Объяснение: потому, что nums[0] + nums[1] == 9, мы возвращаем [0, 1].
package RandomClassBtw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ExampleAlgorithm {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Решение не найдено.");
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 213, 1};
        int target = 18;
        ExampleAlgorithm solution = new ExampleAlgorithm();
        int[] result = solution.twoSum(nums, target);
        for (int index : result) {
            System.out.println(index + " ");
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        System.out.println("arrayList = " + set); // одинаковые элементы не дублируются!!!
    }
}
