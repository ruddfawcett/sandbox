public class Container<T> {
  private T object;

  public Container(T obj) {
    this.object = obj;
  }

  public T getObject() {
    return this.object;
  }

  public String getObjectClass() {
    return this.object.getClass().getName();
  }
}
