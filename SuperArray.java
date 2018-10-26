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
    if (size == data.length) {
      resize();
    }
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
    String[] ary = new String[size * 2];
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
      if (i == size && data[size - i] != target) {
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
      data = data;
    }
    else {
      if (size == data.length) {
        resize();
      }
      String[] ary = new String [data.length];
      for (int i = 0; i < size; i++) {
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
      return null;
    }
    else {
      String[] ary = new String [data.length];
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
      return data.toString();
    }
  }

  public boolean remove(String element) {
    String[] ary = new String [data.length];
    boolean found = false;
    for (int i = 0; i < size-1; i++) {
      if (data[i] == element && !(found)) {
        ary[i] = data[i+1];
        found = true;
      }
      else {
        ary[i] = data[i];
      }
    }
    if (ary.size() ==  data.size()) {
      return false;
    }
    else {
      size = size - 1;
      data = ary;
      return true;
    }
  }

}
