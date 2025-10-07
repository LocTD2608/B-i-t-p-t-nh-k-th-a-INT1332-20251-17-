
public class MomoPayment implements ThanhToan {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VND bằng ví Momo thành công.");
    }
}