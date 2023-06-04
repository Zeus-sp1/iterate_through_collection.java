import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Main{
   
    public static void main(String[] args){
        Product door = new Product ( "Wooden Door", 35);
        Product floorPanel = new Product ( "Floor Panel", 25);
        Product window = new Product ("Glass Window", 10);

       Collection<Product> products = new ArrayList<>();
       products.add(floorPanel);
       products.add(door);
       products.add(window);

    //    System.out.println(door);
    //To print product in column
    // for (Product product : products){
    //     System.out.println(product);
    //    }


    //to interate through product and get specific object from product
    Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()){
            Product product = iterator.next();
           if (product.getWeight() <= 20){
            iterator.remove();
           }
          
        }

        for (Product product : products){
            System.out.println(product);
        }
       
    }
}