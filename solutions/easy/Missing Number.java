// Title: Missing Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/missing-number/

            {
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int[] nums, int first, int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
