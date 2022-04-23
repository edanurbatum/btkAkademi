
package classeswithattributes;

public class ClassesWithAttributes {

    public static void main(String[] args) {
        Product product=new Product();
        product.setName("Leptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        System.out.println(product.getName());
    }
    
}
