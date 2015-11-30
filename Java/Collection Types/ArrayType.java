import java.util.Arrays;

public class ArrayType {
  private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public static void main(String[] args) {
    String[] strings = new String[26];

    int i = 0;
    for (char c : alphabet) {
      strings[i++] = Character.toString(c);
    }

    System.out.println(Arrays.toString(strings));
  }
}
