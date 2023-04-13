package ex5.exercise06;

public class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }
  void show() {
    System.out.println(color + " " + speed);
  }
}
class Car extends Vehicle {
  int displacement;
  int gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  void show() {
    System.out.println(color + " " + speed + " " + displacement + " " + gears);
  }
}
