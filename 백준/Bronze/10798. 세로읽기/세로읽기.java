import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] s = new String[5][15];
        
        for (int i = 0; i < 5; i++) {
            String[] input = sc.next().split("");
            for (int j = 0; j < input.length; j++) {
                s[i][j] = input[j];
            }
        }
        
        String output = "";
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (s[j][i] != null) {
                    output += s[j][i];
                }
            }
        }
        
        System.out.println(output);
    }
}