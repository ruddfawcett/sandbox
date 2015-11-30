import java.util.Arrays;

public class ArrayType {
  private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public static void main(String[] args) {
    String[] strings = new String[26];

    int i = 0;
    for (char c : alphabet) {
      strings[(strings.length - 1) - i++] = Character.toString(c);
    }

    Arrays.sort(strings);

    System.out.println(Arrays.toString(strings));
  }
}
