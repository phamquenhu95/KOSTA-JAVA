package ex6.sec03;

import ex6.sec03.generic.Cup;

public class GenericClassDemo2 {
  public static void main(String[] args) {
    Cup<Beer> cup = new Cup<>();


    cup.setBeverage(new Beer());
    Beer beer = cup.getBeverage();
    beer.drink();

//    cup.setBeverage(new Boricha());

    Cup<Boricha> cup2 = new Cup<>();
    cup2.setBeverage(new Boricha());
    Boricha boricha = cup2.getBeverage();
    boricha.drink();

//    cup2.setBeverage(new Beer());

  }
}
