package Arrays_Hashing;

import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element
// is distinct.

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
