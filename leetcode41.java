class leetcode41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each valid number x in [1, n] at index x - 1
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int targetIdx = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[targetIdx];
                nums[targetIdx] = temp;
            }
        }

        // Step 2: Find the first index that doesn't hold i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: All 1..n are present
        return n + 1;
    }
}
