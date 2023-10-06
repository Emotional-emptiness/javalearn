package RandomClassBtw;

import java.util.HashMap;

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
        int target = 13;
        ExampleAlgorithm solution = new ExampleAlgorithm();
        int[] result = solution.twoSum(nums, target);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
