// Title: Median of Two Sorted Arrays
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

        
        if(arr3.length%2==0) 
        {
            double num1=arr3[mid];
            double num2= arr3[mid+1];
            return (num1+num2)/2;
        }
        else
        {
            return arr3[mid];
        }
    }
}
