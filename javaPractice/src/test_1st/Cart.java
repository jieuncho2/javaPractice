package test_1st;

public class Cart {
	int productID, cnt;
	Cart(int productID, int cnt){
		this.productID = productID;
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "상품번호: " + productID + ", 갯수" + cnt;
	}
	
}
