import java.util.HashSet;

//Given an unsorted array of integers nums, return
// the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        int ans = 1;

        for (int num: nums) set.add(num);

        for (int num : nums) {
            if(!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence st = new LongestConsecutiveSequence();
        int[]  nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(st.longestConsecutive(nums));
    }
}
