package builder.sample02.product;
public class Engine {
    private String brand;

    public Engine() {}

    public Engine(String brand) {
        this.setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}