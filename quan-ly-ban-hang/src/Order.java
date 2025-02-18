import java.util.ArrayList;
import java.util.List;

public class Order {
    private String OrderID;
    private Customer Customer;
    private ArrayList<Product> Products;

    public Order(String OrderID, Customer Customer) {
        this.OrderID = OrderID;
        this.Customer = Customer;
        this.Products = new ArrayList<>();
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer customer) {
        Customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> products) {
        Products = products;
    }

    public void addProduct(Product product) {
        Products.add(product);
    }

    public void removeProduct(Product product) {
        Products.remove(product);
    }

    public double totalPrice() {
        double total = 0;
        for (Product product : Products) {
            total += product.getGia();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Mã đơn hàng: " + OrderID);
        System.out.println("Khách hàng: " + Customer.getName());
        System.out.println("Danh sách sản phẩm mua: ");
        for (Product product : Products) {
            System.out.println(product);

        }
        System.out.println("Tổng giá: " + String.format("%.0f", totalPrice()));
    }

}
