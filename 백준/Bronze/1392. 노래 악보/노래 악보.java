import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] endTime = new int[N + 1];
        int curTime = 0;

        for (int i = 1; i <= N; i++) {
            curTime += sc.nextInt();
            endTime[i] = curTime;
        }

        for (int i = 0; i < Q; i++) {
            int t = sc.nextInt();
            int songIndex = 0;

            while (songIndex < N && endTime[songIndex] <= t) {
                songIndex++;
            }

            System.out.println(songIndex);
        }
    }
}