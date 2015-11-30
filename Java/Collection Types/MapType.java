import java.util.Map;
import java.util.HashMap;

public class MapType {
  private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<String, Object>();

    for (int i = 0; i < 9; i++) {
      map.put(Character.toString(alphabet[i]), i);
    }

    System.out.println("Map: " + map);
  }
}
