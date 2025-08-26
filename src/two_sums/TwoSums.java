package two_sums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 5, 6, 7, 8}, 11);
    }

    public static void twoSum(int[] numsArray, int n) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numsArray.length; i++) {
            int result = n - numsArray[i];
            if (hashMap.containsKey(result)) {
                int index = hashMap.get(result);
                System.out.println(numsArray[index] + "+" + numsArray[i] + "=" + n);
            }
            hashMap.put(numsArray[i], i);
        }
    }

}
