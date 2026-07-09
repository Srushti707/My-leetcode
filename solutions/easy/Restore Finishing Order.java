// Title: Restore Finishing Order
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/restore-finishing-order/

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans= new int[friends.length];
        Set<Integer> friends2= new HashSet<>();
        for(int friend:friends)
        {
            friends2.add(friend);
        }
        int i=0;
        for(int o:order)
        {
            if(friends2.contains(o))
            {
                ans[i++]=o;
            }
        }
        return ans;
    }
}
