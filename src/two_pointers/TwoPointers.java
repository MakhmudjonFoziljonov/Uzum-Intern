package two_pointers;

import java.util.HashSet;
import java.util.Set;

public class TwoPointers {
    public static void main(String[] args) {
        twoPointers(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3});
    }

    public static void twoPointers(int[] array) {
        Set<Integer> setArray = new HashSet<>();
        for (int num : array) {
            setArray.add(num);
        }
        System.out.println(setArray);
    }
}
