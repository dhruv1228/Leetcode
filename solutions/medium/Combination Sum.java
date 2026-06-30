// Title: Combination Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void backtrack(int[] candidates, int target, 
    List<Integer> combination, List<List<Integer>> result, int 
    start) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
