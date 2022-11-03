class Solution {
    public int climbStairs(int n) {
        return climbStairsLogic(n, 1);
    }
    
        HashMap<Integer, Integer> cache = new HashMap<>();
        public int climbStairsLogic(int n, int stepSize) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n == 1) {
            cache.put(1, 1);
            return 1;
        }
        if (n == 2) {
            cache.put(2, 2);
            return 2;
        }
        if (n == 3) {
            cache.put(3, 3);
            return 3;
        }
        int result = 0;

        if (stepSize == 1) {
            result += climbStairsLogic(n - 1, 2) + climbStairsLogic(n - 2, 2);
        } else if (stepSize == 2) {
            result += climbStairsLogic(n - 1, 1) + climbStairsLogic(n - 2, 1);
        }
        cache.put(n, result);
        return cache.get(n);
    }
}