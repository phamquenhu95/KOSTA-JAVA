package ex6.exercise0705;

public class ControllerTest {
  public static void main(String[] args) {
    Controller [] controllers = {new TV(false), new Radio(true)};
    for (Controller controller : controllers) {
      controller.show();
    }

  }
}
