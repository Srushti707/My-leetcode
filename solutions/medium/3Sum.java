// Title: 3Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum/

                }
                else if(nums[i]+nums[j]+nums[k]<0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return ans;
    }
}
