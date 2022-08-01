package test_1st;

public class Product {
	private final int productID;
	private final String productName;
	private final int price;
	
	Product(int productID, String productName, int price){
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}

	int getProductID() {
		return productID;
	}

	String getProductName() {
		return productName;
	}

	int getPrice() {
		return price;
	}
	
}
