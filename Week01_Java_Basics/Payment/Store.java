public class Store {
    private Payment payment; // Payment 리모컨을 꽂을 자리

    // 어떤 부품(Cash, Card 등)을 꽂을지 결정하는 메서드
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // 실제로 결제를 실행하는 메서드
    public void order(int price) {
        if (payment == null) {
            System.out.println("결제 수단이 설정되지 않았습니다.");
            return;
        }
        // 리모컨의 버튼을 누릅니다. 알맹이가 무엇이든 그놈의 pay()가 실행됩니다.
        payment.pay(price); 
    }
}