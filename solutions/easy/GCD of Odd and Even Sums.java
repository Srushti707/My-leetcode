// Title: GCD of Odd and Even Sums
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/gcd-of-odd-and-even-sums/

            even=(even+2);
            odd=(odd+2);
        }
    }
        return gcd(osum,esum);
    static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
            esum+=even;
            osum+=odd;
        return gcd(b,(a%b));
    }
}
