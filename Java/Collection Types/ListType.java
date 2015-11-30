import java.util.List;
import java.util.ArrayList;

public class ListType {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    System.out.println("List: " + list);
  }
}
