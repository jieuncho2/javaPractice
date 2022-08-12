package interface0;

interface Buy {
	void buy();

	default void order() {
		System.out.println("구매 주문");
	}
}

interface Sell {
	void sell();

	default void order() {
		System.out.println("판매 주문");
	}
}

class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("판매하기");

	}

//	디폴트 메서드가 중복이 되었으니 두 인터페이스를 구현하는 Customer 클래스에서 재정의해야 함
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");
	}

	/*
	 * 두 인터페이스의 디폴트 메서드가 중복되는 경우 한 클래스가 다중 구현한 인터페이스에 동일한 디폴트 메서드가 있는 경우 오버라이딩을 해야 함
	 */
}

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();

		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		Sell seller = customer;
		seller.sell();
		buyer.order();

		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
