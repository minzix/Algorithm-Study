import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int n: nums) {
            unique.add(n);
        }
        return Math.min(unique.size(), nums.length / 2);
    }
}