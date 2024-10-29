import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String operator = sc.next();

        while (!operator.equals("=")) {
            int n2 = sc.nextInt();

            switch (operator) {
                case "+" :
                    n1 += n2;
                    break;
                case "-" :
                    n1 -= n2;
                    break;
                case "*" :
                    n1 *= n2;
                    break;
                case "/" :
                    n1 /= n2;
                    break;
            }
            operator = sc.next();
        }
        System.out.println(n1);
    }
}