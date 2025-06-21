package e_commerce_Platform_Search;

public class Product {

	 int productId;
	 String productName;
	 String category;

	    public Product(int productId, String productName, String category) {
	        this.productId = productId;
	        this.productName = productName;
	        this.category = category;
	    }

		@Override
		public String toString() {
			return ("productId=" + productId + ", productName=" + productName + ", category=" + category );
		}
}
