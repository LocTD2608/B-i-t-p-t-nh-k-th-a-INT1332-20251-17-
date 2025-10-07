public class CreditCardPayment implements ThanhToan {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng thẻ tín dụng thành công.");
    }
}