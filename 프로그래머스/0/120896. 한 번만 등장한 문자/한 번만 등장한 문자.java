import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        String answer = "";
        for (Character key : keys) {
            if (map.get(key) == 1) {
                answer += key;
            }
        }
        return answer;
    }
}