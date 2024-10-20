import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static int cnt = 0, K = 0;

    public static void heapSort(int[] arr) {
        int n = arr.length - 1;
        buildMinHeap(arr, n);
        for (int i = n; i >= 2; i--) {
            swap(arr, 1, i);
            heapify(arr, 1, i - 1);
        }
    }

    public static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int k, int n) {
        int left = 2 * k;
        int right = 2 * k + 1;
        int smaller = -1;

        if (right <= n) {
            smaller = arr[left] < arr[right] ? left : right;
        } else if (left <= n) {
            smaller = left;
        } else {
            return;
        }

        if (arr[smaller] < arr[k]) {
            swap(arr, k, smaller);
            heapify(arr, smaller, n);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        cnt++;

        if (cnt == K) {
            for (int k = 1; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N + 1];
        A[0] = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(A);
        if (K > cnt) {
            System.out.print(-1);
        }
        br.close();
    }
}
