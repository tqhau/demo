import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product("P01", "Iphone 16", 25000000);
        Product product2 = new Product("P02", "Iphone 15", 20000000);
        Product product3 = new Product("P03", "Samsung Galaxy S9", 30000000);

        Customer customer1 = new Customer("C01", "Nguyễn Văn A", "Tp. Hồ Chí Minh",
                "abc@gamil.com", "0123456789");
        Customer customer2 = new Customer("C02", "Tran Thị C", "Hà Nội", "bc1@gmail.com",
                "0987654321");

        Order order1 = new Order("O01", customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order("O02", customer2);
        order2.addProduct(product3);


        store.addOrder(order1);
        store.addOrder(order2);


        store.displayOrders();


    }

}
