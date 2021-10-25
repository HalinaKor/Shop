import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Product product1 = new Product(1, "Milk",50);
        Product product2 = new Product(2, "Cheese", 100);
        Product product3 = new Product(3, "Bread", 15);

        shop1.addProduct(product1);
        shop1.addProduct(product2);
        shop1.addProduct(product3);

        /*shop1.returnProduct();*/

        }


    }

