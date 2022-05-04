package day25;

public class Product implements Comparable<Product> {

    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return Float.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
