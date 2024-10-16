import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        LinkedList<Integer> deq = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deq.add(i);
        }
        
        int[] find = new int[M];
        for (int i = 0; i < M; i++) {
            find[i] = sc.nextInt();
        }
        
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            int position = deq.indexOf(find[i]);
            if (position == 0) {
                deq.removeFirst();
                continue;
            }
            
            if (position <= deq.size() / 2) {
                while (find[i] != deq.getFirst()) {
                    deq.addLast(deq.removeFirst());
                    cnt++;
                }
            } else {
                while (find[i] != deq.getFirst()) {
                    deq.addFirst(deq.removeLast());
                    cnt++;
                }
            }
            deq.removeFirst();
        }
        System.out.println(cnt);
    }
}
