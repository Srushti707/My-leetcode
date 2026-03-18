// Title: First Unique Character in a String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
            map.put(num,map.getOrDefault(num,0)+1);
        }
            //System.out.print(key);
                for(int i=0;i<s.length();i++){
                    if(map.get(s.charAt(i))==1){
                        return i;
    }
                    }
            }
        return -1;
}
        for(char num:s.toCharArray()){
