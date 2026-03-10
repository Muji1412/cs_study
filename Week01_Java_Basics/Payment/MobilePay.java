public class MobilePay implements Payment {
  @Override
  public void pay(int amount){
    System.out.println("모바일 페이로 " + amount + "원 결제합니다.");
  }
}