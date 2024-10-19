import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;

        System.out.print("<");
        for (int i = 0; i < N; i++) {
            index = (index + K - 1) % list.size();
            System.out.print(list.remove(index) + (i < N - 1 ? ", " : ""));
        }
        System.out.println(">");
    }
}