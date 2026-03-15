// Title: Roman to Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/roman-to-integer/

        map.put('M',1000);
        for(int i=0; i<s.length(); i++)
        {
            if(i+1<s.length() &&map.get(s.charAt(i+1))> map.get(s.charAt(i)))
        int sum=0;
                sum-=map.get(s.charAt(i));
            }
        }
            else sum+=map.get(s.charAt(i));
        return sum;
    }
            System.out.println(map.get(s.charAt(i)));
            {
}
