package ex6;

public class Keyboard {
  String name;
  public Keyboard(String name) {
  this.name = name;
}

  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Keyboard) {
      Keyboard k = (Keyboard) obj;
      if (name.equals(k.name)) {
        return true;
      }
    }
      return false;
    }
}

class Mouse {
  String name;
  public Mouse(String name) {
    this.name = name;
  }

}