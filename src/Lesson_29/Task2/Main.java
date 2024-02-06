package Lesson_29.Task2;

public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct(new Product(1, "Smartphone", 499.99, 10));
        productCatalog.addProduct(new Product(2, "Laptop", 999.99, 5));
        productCatalog.addProduct(new Product(3, "Headphones", 79.99, 20));
        productCatalog.addProduct(new Product(4, "Tablet", 299.99, 8));
        productCatalog.addProduct(new Product(5, "Smartwatch", 199.99, 15));

        productCatalog.displayCatalog();


//        productCatalog.removeProduct(1);
//        productCatalog.displayCatalog();

//        productCatalog.updateProduct(2,"nbchfvk",5678,4);
//        productCatalog.displayCatalog();



    }
}
