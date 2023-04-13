package ex6.sec03;

public class GenericClassDemo {
  public static void main(String[] args) {
    Cup cup = new Cup();


    cup.setBeverage(new Beer());
    if (cup.getBeverage() instanceof Beer) {
      Beer beer = (Beer) cup.getBeverage();
      beer.drink();
    }
//    cup.getBeverage();

    cup.setBeverage(new Boricha());
//    if (cup.getBeverage() instanceof Boricha) {
      Boricha boricha = (Boricha) cup.getBeverage();
      boricha.drink();

//    }
    try {
      cup.setBeverage(new Boricha());
      Beer beer2 = (Beer) cup.getBeverage();
      boricha.drink();

    } catch (ClassCastException e) {
      throw new RuntimeException(e);
    }
  }
}
