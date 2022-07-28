package chapter08;

interface Providable {
	void leisuerSports();

	void sightseeing();

	void food();
}

class KoreanTour implements Providable {

	@Override
	public void leisuerSports() {
		// TODO Auto-generated method stub
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("경복궁 관광 투어");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("전주비빔밥 투어");
	}

}

class JapanTour implements Providable {

	@Override
	public void leisuerSports() {
		// TODO Auto-generated method stub
		System.out.println("도쿄타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		// TODO Auto-generated method stub
		System.out.println("오사카 관광 투어");
	}

	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("초밥 투어");
	}

}

class TourGuide {
//	private Providable tour = new KoreaTour();

	private Providable tour;

	public TourGuide(Providable provaidable) {
		tour = provaidable;
	}

	public void leisureSports() {
		tour.leisuerSports();
	}

	public void sightseeing() {
		tour.sightseeing();
	}

	public void food() {
		tour.food();
	}

}

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide = new TourGuide(new KoreanTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
		
		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports();
		guide2.sightseeing();
		guide2.food();
	}

}
