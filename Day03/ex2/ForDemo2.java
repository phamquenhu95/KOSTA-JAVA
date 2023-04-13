package ex2;

public class ForDemo2 {
  public static void main(String[] args) {
    int sum = 0;
    sum += 1;
    sum += 2;
    sum += 3;
    sum += 4;
    sum += 5;
    sum += 6;
    sum += 7;
    sum += 8;
    sum += 9;
    sum += 10;
    System.out.println("sum = " + sum);

    sum = 0;
    for(int i = 1; i <= 10; i++){
      sum += i;
    }
    System.out.println("sum = " + sum); // 1~10 의 합

//    new Scanner(System.in);
//    if (1 == 1) {
//      System.out.println("같다");
//    }



    sum = 0;
    for(int i = 11; i <= 20; i++){ // 55+100
      sum += i;
    }
    System.out.println("sum = " + sum); // 11~20 의 합


    sum = 0;
    for(int i = 21; i <= 30; i++){ // 55 + 200
      sum += i;
    }
    System.out.println("sum = " + sum); // 21~30 의 합

  }
}
