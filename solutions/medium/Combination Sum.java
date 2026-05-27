// Title: Combination Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/combination-sum/

            }
                return;
                ans.add(new ArrayList<>(list));
            {
            if(target==0)
            return;

        }
        //pick 
        if(candidates[i]<=target)
        {
            list.add(candidates[i]);
            sum(candidates,target-candidates[i], i, list, ans);
            list.remove(list.size()-1);
        }
        sum(candidates, target,i+1, list, ans);
    }
    
