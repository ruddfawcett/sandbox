public class DoWhile {
  public static void main(String[] args) {
    Boolean maybe = true;
    int i = 0;

    do {
      System.out.println(i);

      if (i == 9) {
        maybe = false;
      }

      i++;
    }
    while (maybe);
    
    System.out.println("Done.");
  }
}
