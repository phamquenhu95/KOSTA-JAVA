package ex5.exercise05;

public class Phone {
  protected String owner;
  Phone(String owner) { // 초기화
    this.owner = owner;
  }
  void talk() {
    System.out.println(owner + " 가 통화중입니다.");
  }

}

class Telephone extends Phone {
  private String when;
  Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }
  void autoAnswering() {
    System.out.println(owner + " 가 부재중이니 " + when + "전화바랍니다.");
  }

}

class Smartphone extends Telephone {
  private String game;
  Smartphone(String owner, String game) {
    super(owner, "when");
    this.game = game;
  }
  void playGame() {
    System.out.println(owner + " is playing " + game);
  }
}
