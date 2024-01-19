public class Product {
    private int productID;
    private String name;
    private String brand;
    private Boolean inStock;
    public Product() {
       this.productID = productID;
       this.name = "Steven";
       this.brand = "bart";
       this.inStock = true;
    }
    public Product(int productID,String name,String brand,Boolean inStock){
        this.productID = productID;
        this.name = name;
        this.brand = brand;
        this.inStock = inStock;
    }
    public static void main(String[] args){
        Product myProduct = new Product(7,"Supra","BMW",true);


    }
}
