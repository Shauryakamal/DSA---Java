package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionof2arrays {
    public static int[] intersectionof2arrays(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = result.get(i);
        return ans;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        intersectionof2arrays obj = new intersectionof2arrays();

        int[] ans = obj.intersectionof2arrays(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}
