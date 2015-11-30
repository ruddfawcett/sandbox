import java.util.Set;
import java.util.HashSet;

public class SetType {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < 10; i++) {
      set.add(i);
    }

    int sizeInitial = set.size();

    /**
     * Sets cannot contain cuplicate objects, so this won't actually
     * add anything.
     */
    for (int i = 0; i < 10; i++) {
      set.add(i);
    }

    int sizeFinal = set.size();

    if (sizeInitial != sizeFinal) {
      System.out.println("Java is broken...");
    }

    System.out.println("Set: " + set);
  }
}
