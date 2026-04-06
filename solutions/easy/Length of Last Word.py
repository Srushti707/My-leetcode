// Title: Length of Last Word
            // Difficulty: Easy
            // Language: Python
            // Link: https://leetcode.com/problems/length-of-last-word/

class Solution(object):
    def lengthOfLastWord(self, s):
        c=s.split()
        return len(c[-1])
        
