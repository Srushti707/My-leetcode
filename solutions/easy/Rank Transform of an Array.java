// Title: Rank Transform of an Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/rank-transform-of-an-array/

        int count=0;
        for(int i=0; i<len; i++)
        {
            if(!map.containsKey(sorted[i]))
            {
            map.put(sorted[i],++count);
            }
        }
        int[] ans=new int[len];
        for(int j=0; j<len; j++)
        {
            ans[j]=map.get(arr[j]);
        }
        return ans;
        Map <Integer,Integer> map= new HashMap<>();
        Arrays.sort(sorted);
        int[] sorted= Arrays.copyOf(arr,len);
    public int[] arrayRankTransform(int[] arr) {
        int len=arr.length;
class Solution {
