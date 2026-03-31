// Title: Remove Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-element/

            i--;
            j++;
        }
      }
      return count;
}
      public void shift(int[] nums, int start )
      {
        for(int i=start; i<nums.length-1; i++)
        {
            nums[i]=nums[i+1];
        }
      }
    }
