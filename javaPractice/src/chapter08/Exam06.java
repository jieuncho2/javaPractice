package chapter08;

interface Player {
	void play();

	void stop();
}

class VideoPlayer implements Player {
	private int id;
	private static int count = 0;

	public VideoPlayer() {
		id = ++count;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("비디오 재생 시작!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("비디오 재생 종료!");
	}

	public void printInfo() {
		System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");
	}

}

class CDPlayer implements Player {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD 재생 시작!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD 재생 종료!");
	}

	public void cleaning() {
		System.out.println("헤드를 청소했습니다.");
	}

}

public class Exam06 {
	public static void main(String[] args) {
		Player[] a = new Player[2];
		a[0] = new VideoPlayer();
		a[1] = new CDPlayer();

		for (Player p : a) {
			p.play();
			p.stop();
			System.out.println();
		}

		VideoPlayer[] b = new VideoPlayer[4];
		for (int i = 0; i < b.length; i++) {
			b[i] = new VideoPlayer();
		}
		b[b.length - 1].printInfo();
	}
}
