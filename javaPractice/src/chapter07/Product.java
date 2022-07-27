package chapter07;

public class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
		price = 0;
		bonusPoint =0;
	}

}
