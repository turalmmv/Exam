package Lesson_29.Task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProductCatalog {

    HashMap<Integer, Product> products = new LinkedHashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void updateProduct(int productId, String newName, double newPrice, int newQuantity) {
        for (Map.Entry<Integer, Product> productEntry : products.entrySet()) {
            if (productEntry.getKey().equals(productId)) {
                productEntry.getValue().setName(newName);
                productEntry.getValue().setPrice(newPrice);
                productEntry.getValue().setQuantity(newQuantity);
            }
        }
    }

    public void removeProduct(int productId) {
        products.remove(productId);
    }

    public void displayCatalog() {
        for (Map.Entry<Integer, Product> productEntry : products.entrySet()) {
            System.out.println(productEntry.getKey() + " ---> " + productEntry.getValue());
        }
    }
}
