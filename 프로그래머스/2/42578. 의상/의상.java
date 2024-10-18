import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] s: clothes) {
            String category = s[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        
        int totalCnt = 1;
        
        for (Integer cnt: map.values()) {
            totalCnt *= (cnt + 1);
        }
        
        return totalCnt - 1;
    }
}