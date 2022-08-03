package chapter09;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

class MyScore {
	private int score;

	public void setScore(int s) throws MyException {
		if (s < 0) {
			throw new MyException("점수는 음수가 될 수 없습니다.");
		} else {
			this.score = s;
		}
	}
}

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyScore obj = new MyScore();
		try {
			obj.setScore(-10);
		} catch (MyException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
