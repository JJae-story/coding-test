import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                days[i] += 1;
            }
        }

        ArrayList<Integer> count = new ArrayList<>();

        int before = days[0];
        int cnt = 1;

        for (int i = 1; i < days.length; i++) {
            if (days[i] <= before) {
                cnt++;
            } else {
                count.add(cnt);
                cnt = 1;
                before = days[i];
            }
        }
        count.add(cnt);

        int[] answer = new int[count.size()];
        for (int i = 0; i < count.size(); i++) {
            answer[i] = count.get(i);
        }

        return answer;
    }
}