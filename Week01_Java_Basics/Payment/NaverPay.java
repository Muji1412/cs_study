import java.util.Scanner;

public class NaverPay implements Payment {
    @Override
    public void pay(int amount) {
      System.out.println("네이버페이 결제 수단을 입력해주세요.");
      System.out.println("1. 포인트");
      System.out.println("2. 카드");
      System.out.println("3. 계좌");

      Scanner sc = new Scanner(System.in);

      int choice = sc.nextInt();
      if (choice == 1) {
        naverPayWithPoint(amount);
      } else if (choice == 2) {
        naverPayWithCard(amount);
      } else if (choice == 3) {
        naverPayWithAccount(amount);
      } else {
        System.out.println("잘못된 입력입니다.");
      }
    }
    
    public void naverPayWithPoint(int amount) {
      System.out.println("네이버페이 포인트로 " + amount + "원 결제합니다");
    }

    public void naverPayWithCard(int amount) {
      System.out.println("네이버페이 카드로 " + amount + "원 결제합니다");
    }
    public void naverPayWithAccount(int amount) {
      System.out.println("네이버페이 계좌로 " + amount + "원 결제합니다");
    }
}
