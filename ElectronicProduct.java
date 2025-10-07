public class ElectronicProduct extends SanPham {
    private String imei;

    public ElectronicProduct(int id, String name, double price, String imei) {
        super(id, name, price);
        this.imei = imei;
    }
}