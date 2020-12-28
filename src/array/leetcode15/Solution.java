package array.leetcode15;
// https://leetcode-cn.com/problems/3sum/submissions/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * 三数之和
     * @param nums 数组
     * @return List型的集合
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            int temp = -nums[i];
            while(left < right) {
                if (nums[left] + nums[right] > temp) {
                    right -= 1;
                }else if(nums[left] + nums[right] < temp) {
                    left += 1;
                }else {
                    List<Integer> mid = new ArrayList<>();
                    mid.add(nums[i]);
                    mid.add(nums[left]);
                    mid.add(nums[right]);
                    returnList.add(mid);
                    do {
                        left += 1;
                    }while (left < right && nums[left] == nums[left - 1]);
                    do {
                        right -= 1;
                    }while (left < right && nums[right] == nums[right + 1]);
                }
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        int[] ints = {-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(ints);
        for (List<Integer> list:
             lists) {
            for (Integer i :
                    list) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
