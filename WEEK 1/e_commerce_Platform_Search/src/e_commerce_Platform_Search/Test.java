package e_commerce_Platform_Search;

public class Test {
	    public static void main(String[] args) {
	        Product[] products = {
	            new Product(103, "Grapes", "Fruits"),
	            new Product(101, "Mangoes", "Fruits"),
	            new Product(105, "Brinjal", "Vegetables"),
	            new Product(102, "Radish", "Vegetables"),
	            new Product(104, "Apples", "Fruits")
	        };

	                int targetId = 105;
	                long startLinear = System.nanoTime();
	                Product linearResult = LinearSearch.search(products, targetId);
	                long endLinear = System.nanoTime();
	                if (linearResult != null) {
	                    System.out.println(linearResult);
	                } else {
	                    System.out.println("Product not found (Linear Search)");
	                }
	                System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
	                
	                BinarySearch.sortProductsById(products);
	                long startBinary = System.nanoTime();
	                Product binaryResult = BinarySearch.search(products, targetId);
	                long endBinary = System.nanoTime();
	                if (binaryResult != null) {
	                    System.out.println(binaryResult);
	                } else {
	                    System.out.println("Product not found (Binary Search)");
	                }
	                System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
	            }

}

