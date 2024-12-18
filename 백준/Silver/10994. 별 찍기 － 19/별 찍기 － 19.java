import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 정사각형 크기
        int size = 4 * N - 3;
        // 2차원 배열
        char[][] arr = new char[size][size];

        // 공백 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = ' ';
            }
        }

        // 별 테두리 채우기
        for (int i = 0; i < N; i++) {
            int start = 2 * i;
            int end = size - 1 - 2 * i;

            // 상하 테두리
            for (int j = start; j <= end; j++) {
                arr[start][j] = '*';
                arr[end][j] = '*';
            }

            // 좌우 테두리
            for (int j = start; j <= end; j++) {
                arr[j][start] = '*';
                arr[j][end] = '*';
            }
        }

        // 배열 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}