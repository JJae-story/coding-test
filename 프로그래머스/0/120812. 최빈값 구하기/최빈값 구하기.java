import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        int maxCount = 0;
        int maxValue = 0;
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue() > maxCount) {
                maxCount = e.getValue();
                maxValue = e.getKey();
            } else if(e.getValue() == maxCount) {
                maxValue = -1;
            }
        }
        return maxValue;
    }
}