public class CashPayment implements ThanhToan {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng tiền mặt thành công.");
    }
}