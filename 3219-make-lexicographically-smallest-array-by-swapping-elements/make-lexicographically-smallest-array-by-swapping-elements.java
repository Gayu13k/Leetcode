class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int l = 0;

        while (l < n) {
            int r = l + 1;

            while (
                r < n &&
                pairs[r][0] - pairs[r - 1][0] <= limit
            ) {
                r++;
            }

            int[] group = new int[r - l];

            for (int i = l; i < r; i++) {
                group[i - l] = pairs[i][1];
            }

            Arrays.sort(group);

            for (int i = 0; i < group.length; i++) {
                nums[group[i]] = pairs[l + i][0];
            }

            l = r;
        }

        return nums;
    }
}