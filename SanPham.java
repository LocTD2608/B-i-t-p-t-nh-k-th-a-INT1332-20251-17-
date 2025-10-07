public abstract class SanPham {
    protected int id;
    protected String name;
    protected double price;

    public SanPham(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

