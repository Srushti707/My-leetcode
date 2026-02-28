// Title: Destroying Asteroids
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/destroying-asteroids/

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int i=0; i<asteroids.length-1; i++)
        {
            if(mass2>=asteroids[i] ) mass2+=asteroids[i];
            else return false;
        }
        if(mass2>=asteroids[asteroids.length-1]) return true;
        else return false;
    }
        long mass2= mass;
}
