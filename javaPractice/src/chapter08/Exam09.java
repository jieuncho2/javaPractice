package chapter08;
interface Camera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}
class MyCellphone implements Camera, Call, Memo, Clock{

	@Override
	public void clock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	
}
class PhoneUser{
	void call(Call call) {
		System.out.println("전화를 걸었습니다.");
	}
}
public class Exam09 {
	public static void main(String[] args) {
		MyCellphone phone1 = new MyCellphone();
		Camera phone2 = new MyCellphone();
		Call phone3 = new MyCellphone();
		Memo phone4 = new MyCellphone();
		Clock phone5 = new MyCellphone();
		
		PhoneUser user1 = new PhoneUser();
		user1.call(phone1);
		user1.call(phone3);
		user1.call((Call)phone2);
		user1.call((MyCellphone)phone2);
	}
}
