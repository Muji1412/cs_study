import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store myStore = new Store();
        Payment mySelection = null;

        System.out.println("결제 수단을 선택하세요 (1:현금, 2:카드, 3:모바일 4:네이버페이)");
        int choice = sc.nextInt();

        // [STEP 1: 선택] 여기서 딱 한 번 '알맹이'를 결정합니다.
        if (choice == 1) {
            mySelection = new Cash();        // 현금 팩 준비
        } else if (choice == 2) {
            mySelection = new CreditCard();  // 카드 팩 준비
        } else if (choice == 3) {
            mySelection = new MobilePay();   // 모바일 팩 준비
        } else if (choice == 4) {
            mySelection = new NaverPay();
        }

        // [STEP 2: 조립] 결정된 '물건'을 Store의 슬롯에 꽂습니다.
        myStore.setPayment(mySelection);

        // [STEP 3: 실행] Store는 이제 '무엇'인지 몰라도 됩니다. 그냥 실행!
        // 내부적으로는 payment.pay(10000) 딱 한 줄만 돌아갑니다.
        myStore.order(10000); 
    }
}