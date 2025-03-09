import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    String alphabet = sc.nextLine();

    for (String s : croatiaAlphabet) {
      if (alphabet.contains(s)) {
        alphabet = alphabet.replace(s, "1");
      }
    }

    int count = alphabet.length();

    System.out.println(count);
  }
}