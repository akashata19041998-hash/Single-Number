import java.util.*;

public class singlenumber {

    static class solution {
        public int singlenumber(int[] nums) {
            int xorResult = 0;
            for (int num : nums) {
                xorResult ^= num;
            }
            return xorResult;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 4, 3, 5, 2 };
        solution sol = new solution();
        int result = sol.singlenumber(nums);
        System.out.println("single number is :" + result);
    }
}