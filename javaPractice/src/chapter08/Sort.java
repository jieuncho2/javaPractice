package chapter08;

public interface Sort {

	void ascending(int[] arr);

	void descenging(int[] arr);

	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}

}

class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descenging(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}
	
}

class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descenging(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("HeapSort descending");
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}
	
}

class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descenging(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort descending");
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}
	
}
