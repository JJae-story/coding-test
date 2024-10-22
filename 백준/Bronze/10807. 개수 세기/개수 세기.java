import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        int v = sc.nextInt();

        Hashtable<Integer, ArrayList<Integer>> ht = new Hashtable<>();

        int idx = 0;
        while (idx < arr.size()) {
            int currentValue = arr.get(idx++);

            if (!ht.containsKey(currentValue)) {
                ht.put(currentValue, new ArrayList<>());
            }
            ht.get(currentValue).add(currentValue);
        }

        if (ht.containsKey(v)) {
            System.out.println(ht.get(v).size());
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}