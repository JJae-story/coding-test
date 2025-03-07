import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    String upper = s.toUpperCase();

    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : upper.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    String result = "";
    int max = 0;

    for (char c : map.keySet()) {
      if (map.get(c) > max) {
        max = map.get(c);
        result = String.valueOf(c);
      } else if (map.get(c) == max) {
        result = "?";
      }
    }

    System.out.println(result);
  }
}