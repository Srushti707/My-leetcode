// Title: Check Divisibility by Digit Sum and Product
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

            return true;
        }
        return false;
    }
    static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit= n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
}
