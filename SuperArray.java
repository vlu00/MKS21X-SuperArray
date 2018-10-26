public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int startingCapacity) {
    data = new String[startingCapacity];
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
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null + ": ERROR-Index out of range";
    }
    else {
      return data[index];
    }
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size()) {
      return null + ": ERROR-Index out of range";
    }
    else {
      String x = data[index];
      data[index] = element;
      return x;
    }
  }

  public String toString() {
    String s = "[";
    for (int i = 0; i < size; i++) {
      if (i == size -1 ) {
          s = s + data[i];
        }
      else {
        s = s + data[i] + ", ";
      }
    }
    s = s + "]";
    return s;
  }

  public String toStringDebug() {
    String s = "[";
    for (int i = 0; i < data.length; i++) {
      if (i == data.length -1 ) {
        if (data[i] == null) {
          s = s + null;
        }
        else {
          s = s + data[i];
        }
      }
      else if (data[i] == null) {
        s = s + null+ ", ";
      }
      else {
        s = s + data[i] + ", ";
      }
    }
    s = s + "]";
    return s;
   }

  private void resize() {
    String[] ary = new String[size * 2 + 1];
    for(int i = 0; i < size; i++) {
      ary[i] = data[i];
    }
    data = ary;
  }

  public boolean contains(String target) {
    boolean x = false;
    for (int i = 0; i < size; i++) {
      if (data[i] == target) {
        return true;
      }
    }
    return x;
  }

  public int indexOf(String target) {
    int index = 0;
    for(int i = 0; i < size; i++) {
      if (i == size - 1 && data[i] != target) {
        return -1;
      }
      if (data[i] == target) {
        return index;
      }
      else {
        index++;
      }
    }
    return index;
  }

  public int lastIndexOf(String target) {
    int index = 0;
    for(int i = 0; i < size; i++) {
      if (i == size-1 && data[size - i] != target) {
        return -1;
      }
      if (data[size - i] == target) {
        return size - index;
      }
      else {
        index++;
      }
    }
    return size - index;
  }

  public void add(int index, String element) {
    if (index < 0 || index > size()) {
      System.out.println("ERROR-Index out of range");
    }
    else {
      if (size == data.length) {
        resize();
      }
      String[] ary = new String [data.length];
      for (int i = 0; i < size+1; i++) {
        if (i < index) {
          ary[i] = data[i];
        }
        else if (i == index) {
          ary[i] = element;
        }
        else {
          ary[i] = data[i-1];
        }
      }
      size++;
      data = ary;
    }
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      return null + ": ERROR-Index out of range";
    }
    else {
      String[] ary = new String [data.length];
      String x = data[index];
      for (int i = 0; i < size-1; i++) {
        if (i < index) {
          ary[i] = data[i];
        }
        else {
          ary[i] = data[i+1];
        }
      }
      size = size - 1;
      data = ary;
      return x;
    }
  }

  public boolean remove(String element) {
    String[] ary = new String [data.length];
    boolean found = false;
    for (int i = 0; i < size-1; i++) {
      if (found) {
        ary[i] = data[i+1];
      }
      else if (data[i] == element && !(found)) {
        ary[i] = data[i+1];
        found = true;
      }
      else {
        ary[i] = data[i];
      }
    }
    if (!found) {
      return false;
    }
    else {
      size = size - 1;
      data = ary;
      return true;
    }
  }

}
