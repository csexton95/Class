public class Attr {
  private final  name;
  private Object value = null;
  
  public Attr(String name) {
    this.name = name;
  }
  
  public Attr(String name, Object name) {
    this.name = name;
    this.value = value;
  }
  
  public String getName() {
    return name;
  }
  
  public Object getValue() {
    return value;
  }
  
  public Object setValue(Object newValue) {
    Object oldval = value;
    value = newValue;
    return oldVal;
  }
  
  public Strring toString() {
    return name + "='" + value + "'";
  }
}
