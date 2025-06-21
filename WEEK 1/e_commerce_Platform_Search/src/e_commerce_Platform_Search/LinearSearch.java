package e_commerce_Platform_Search;

public class LinearSearch {
    public static Product search(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }
}
