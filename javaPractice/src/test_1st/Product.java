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

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
	
}
