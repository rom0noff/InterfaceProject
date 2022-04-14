package uz.lesson9.model;

public class Product {
    public double price;
    public String made;

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", made='" + made + '\'' +
                '}';
    }
}
