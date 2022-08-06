package chapter09;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println(getMessage());
//		super.printStackTrace();
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
			e.printStackTrace();
		}
	}

}
