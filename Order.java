import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<SanPham> products;
    private ThanhToan paymentMethod;

    public Order(String customerName) {
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    public void addProduct(SanPham product) {
        products.add(product);
    }

    public double getTotalAmount() {
        double total = 0;
        for (SanPham p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void setPaymentMethod(ThanhToan paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        double amount = getTotalAmount();
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount);
        paymentMethod.pay(amount);
    }
}
