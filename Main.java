public class Main {
    public static void main(String[] args) {
        // Tạo đơn hàng 1
        Order order1 = new Order("Nguyễn Văn A");
        order1.addProduct(new FoodProduct(1, "Bánh mì", 20000, "2025-12-31"));
        order1.addProduct(new ElectronicProduct(2, "Tai nghe", 180000, "123456789"));
        order1.setPaymentMethod(new CashPayment());
        order1.checkout();

        System.out.println();

        // Tạo đơn hàng 2
        Order order2 = new Order("Nguyễn Văn B");
        order2.addProduct(new ElectronicProduct(3, "Điện thoại", 500000, "987654321"));
        order2.setPaymentMethod(new CreditCardPayment());
        order2.checkout();
    }
}

