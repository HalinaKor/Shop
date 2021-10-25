import java.util.*;

public class Shop {
    List<Product> products1 = new ArrayList<Product>();
    List<Product> products2 = new ArrayList<Product>();

    public void addProduct (Product product){
            products1.add(product);
            for (Product p1: products1) {
                System.out.println("ID "+p1.getId()+ p1.getName());

            }






          /*      int idNumber = p.getId();


            if (product.id.equals(p.getId())) {
                products1.add(product);
                System.out.println("Добавили");
            }
            else {
                products1.remove(product);
            }*/
            }


    public void returnProduct (){
        for (Product product : products1) System.out.println(product);
    }

    public void deleteProduct (int id){
        HashSet<Product> products = new HashSet<Product>();
        products.remove(id);

    }
}
