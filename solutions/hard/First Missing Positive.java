// Title: First Missing Positive
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/first-missing-positive/

            correctIndex);
            else i++;
        }
        for(int j=0; j<nums.length;j++)
        {
            if(j!=nums[j]-1) return j+1;
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first , int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
