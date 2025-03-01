import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String words = br.readLine();
    int time = 0;

    for (int i = 0; i < words.length(); i++) {
      char word = words.charAt(i);

      if (word >= 'A' && word <= 'C') {
        time += 3;
      } else if (word >= 'D' && word <= 'F') {
        time += 4;
      } else if (word >= 'G' && word <= 'I') {
        time += 5;
      } else if (word >= 'J' && word <= 'L') {
        time += 6;
      } else if (word >= 'M' && word <= 'O') {
        time += 7;
      } else if (word >= 'P' && word <= 'S') {
        time += 8;
      } else if (word >= 'T' && word <= 'V') {
        time += 9;
      } else if (word >= 'W' && word <= 'Z') {
        time += 10;
      } else {
        time += 2;
      }
    }

    System.out.println(time);
  }
}