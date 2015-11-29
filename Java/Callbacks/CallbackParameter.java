/**
 * Works with the Callback interface to pass back information to the function.
 */
public class CallbackParameter {
  /**
   * The Callback interface has a single method `call:`, which can be
   * called from a parameter, and accepts a parameter of its own.
   */
  public interface Callback {
    public void call(Object obj);
  }
  
  /**
   * Calls a function with a parameter (an integer).
   * @param  The number of times to loop.
   * @param  The callback.
   */
  public static void iterate(int x, Callback cmd) {
    for (int i = 0; i < x; i++) {
      cmd.call(i);
    }
  }

  public static void main(String[] args) {
    iterate(10, new Callback() {
      public void call(Object obj) {
        System.out.println(obj);
      }
    });
  }
}
