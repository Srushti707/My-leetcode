// Title: Sum of All Subset XOR Totals
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/

        {
            subsets.add(new ArrayList<>(list));
            return;
        }

        //pick
        list.add(nums[i]);
        subset( subsets, list, i+1, nums);
        list.remove(list.size()-1);
        //not pick
        subset( subsets, list, i+1,nums);
    }
}
