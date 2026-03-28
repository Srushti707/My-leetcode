// Title: Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/

            i++;
        }
        return list;
    }

    public int binarySearch(ArrayList<Integer> arr, int k) {
        int start = 0;
        int end = arr.size() - 1;
        while (start <=end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);
            if (val == k) {
                return val;
            } else if (val > k) {
                end = mid - 1;
            } else
                start = mid + 1;
