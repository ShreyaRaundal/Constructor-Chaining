public class ProductDriver{
    public static void main(String[] args){
        System.out.println("Create product with no-arg constructor: ");
        Product p1=new Product();
        p1.display();

        System.out.println("Create product with 2-arg constructor: ");
        Product p2=new Product("Headphones",1999.99);
        p2.display();

        System.out.println("Create product with 3-arg constructor: ");
        Product p3=new Product("Smartphone",14999.99,"Electronic");
        p3.display();

    }
}