package second;

/**
 * Created by expert on 7/3/18.
 */
public class Product {
    int id;
    int price;
    String name;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {
Product p1=new Product(1,2000,"bag");
Product p2=new Product(2,20,"pen");
Product p3=new Product(3,1500,"calculator");
 Product array []={p1,p2,p3};
        System.out.println("product details of those having price greater than 1000: ");

        for (Product obj:array) {
         if (obj.price>1000){

             System.out.println("Id : "+obj.id+"\n"+"object name: "+obj.name+"\n"+"object price: "+obj.price);
         }

        }
    }
}
