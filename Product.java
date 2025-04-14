public class Product{
    String name;
    double price;
    String category;

    // no-arg-constructor
    Product(){
        this("Default Product",0.0,"Uncategorized");
        System.out.println("No-arg constructor called");
    }

    // 2-arg constructor
    Product(String name,double price){
        this(name,price,"General");
        System.out.println("2-arg constructor called");
    }

    Product(String name,double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
        System.out.println("3argument constructor called");
    }
    public void display(){
        System.out.println("Product Name :"+name);
        System.out.println("Price :"+price);
        System.out.println("Category :"+category);
        System.out.println("--------------------------------------------------");
    }
}