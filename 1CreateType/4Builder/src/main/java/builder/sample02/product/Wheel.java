package builder.sample02.product;
public class Wheel {
    private String brand;

    public Wheel() {}

    public Wheel(String brand) {
        this.setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}