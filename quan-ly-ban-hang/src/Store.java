import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public Store() {
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    public void displayOrders() {
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}
