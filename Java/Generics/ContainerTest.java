import java.util.List;
import java.util.ArrayList;

public class ContainerTest {
  public static void main(String[] args) {
    Container<String> stringGeneric = new Container<>("Test");

    log(stringGeneric.getObject().length()); // We know that this is a string, because of <String>.
    log(stringGeneric.getObjectClass());

    List<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    Container<List> listGeneric = new Container<>(list);

    log(listGeneric.getObject().size());
    log(listGeneric.getObjectClass());
  }

  public static void log(Object obj) {
    System.out.println(obj);
  }
}
