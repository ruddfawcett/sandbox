/**
 * Works with the callback interface to call a method after a second.
 */
public class MethodParameter {
  /**
   * The Callback interface has a single method `call`, which can be
   * called from a parameter.
   */
  public interface Callback {
    public void call();
  }

  /**
   * Executes a callback after a second.
   * @param cmd The callback.
   */
  public static void process(Callback cmd) {
    try {
      Thread.sleep(1000);
      cmd.call();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    process(new Callback() {
      public void call() {
        System.out.println("Done.");
      }
    });
  }
}
