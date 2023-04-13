package ex08.chapter12.exercise01;

import java.util.*;

public class PhoneBook {
  private Scanner scanner; // 필드  입력받음
  private Map<String, Phone> map = new HashMap<>(); // 필드
  public PhoneBook() { scanner = new Scanner(System.in); } // 생성자 , 반드시 scanner 있어야 됨

  public void run() { // 메서드
    Menu menu;
    System.out.println("전화번호 관리 프로그램");
    while (true) {
      System.out.println("드록: 1, 삭제: 2, 찾기 : 3, 전체보기 : 4, 종료 : 5  ");
      System.out.println("번호를 입력하세요");

      menu = readMenu();
      switch (menu) {
        case INSERT:
          insert();
          break;
        case DELETE:
          delete();
          break;
        case SEARCH:
          search();
          break;
        case SHOWALL:
          showAll();
          break;
        case EXIT:
          System.out.println("프로그렘 종료");
          return;
        default:
          System.out.println("존재하지 않는 메뉴입니다.");

      }
    }
  }

  private Menu readMenu() {
    String s = "";
    int num, menuNo;
    try {
      s = scanner.nextLine();
      if (s.length() == 1 && Character.isDigit(s.charAt(0)) ) {
        num = Integer.parseInt(s);
        if (num >= 1 && num <= 5)
        return Menu.values()[num];
      else return Menu.WRONG_MENU;
    }else {
        return Menu.WRONG_MENU;
//    }
//      return  Menu.INSERT;
      }
      } catch (NumberFormatException e) {
      return Menu.WRONG_MENU;
    }

  }
  private void insert() {
    System.out.println("전화 번호 입력");
    System.out.println("이름 ==> ");
    String name = scanner.nextLine();
    if(map.get(name)!= null) {
      System.out.println("이미 존재하는 전화번호입니다.");
      return;
    }
    System.out.println("주소 ==> ");
    String address = scanner.nextLine();
    System.out.println("전화번호 ==> ");
    String telNum = scanner.nextLine();

    // 해쉬 맵에 삽입
    map.put(name, new Phone(name, address, telNum));
  }
  private void delete() {
    System.out.println("전화 번호 삭제");
    Set<String> keys = map.keySet(); // key 문자열을 가진 집합 Set 컬렉션 리턴
    if(keys.isEmpty()) {
      System.out.println("삭제할 정보가 없습니다.");
      return;
    }
    System.out.println(" 이름 ==> ");
    String name = scanner.nextLine();
    Phone p = map.remove(name); // 해쉬맵에서 삭제
    if (p == null)
      System.out.println(name + "는 등록되지 않은 사람입니다.");
    else {
      System.out.println(name + "은 삭제되었습니다.");
    }
  }
  private void search() {
    System.out.println("전화 번호 검색");
    Set<String> keys = map.keySet(); // key 문자열을 가진 집합 Set 켈렉션 리턴
    if(keys.isEmpty()) {
      System.out.println("등록된 정보가 없습니다.");
      return;
    }
    System.out.println("이름 ==> ");
    String name = scanner.nextLine();
    Phone p = map.get(name); // 해쉬 테이블에서 검색
    if (p == null)
      System.out.println(name + "등록되지 않은 사람입니다.");
    else {
      System.out.println(p.toString());
    }

  }
  private void showAll() {
    System.out.println("전화 번호 전체 보기");
    Set<String> keys = map.keySet(); // key 문자열을 가진 집합 Set 켈렉�
    Iterator<String> it = keys.iterator(); // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
    if(keys.size() == 0) {
      System.out.println("출력할 내용이 없습니다.");
    }
while (it.hasNext()) {
  String name = it.next();
  Phone p = map.get(name);
  System.out.println(p.toString());
}
  }


  }


