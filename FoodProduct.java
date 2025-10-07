
public class FoodProduct extends SanPham {
    private String expiryDate;

    public FoodProduct(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }
}
