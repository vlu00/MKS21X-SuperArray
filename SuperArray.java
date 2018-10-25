public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      data[i] = null;
    }
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public boolean add(String element) {
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    }
    else {
      return data[index];
    }
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size()) {
      return null;
    }
    else {
      String x = data[index];
      data[index] = element;
      return x;
    }
  }

  public String toString() {
    String s = "[";
    for (int i = 0; i < data.length; i++) {
      if (i == data.length -1 ) {
        if (data[i] == null) {
          s = s + "null";
        }
        else {
          s = s + data[i];
        }
      }
      else if (data[i] == null) {
        s = s + "null, ";
      }
      else {
        s = s + data[i] + ", ";
      }
    }
    s = s + "]";
    return s;
  }
}
