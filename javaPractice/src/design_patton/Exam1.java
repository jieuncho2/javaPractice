package design_patton;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. 외부에서 사용하는 코드 만들기
		//외부에서 Company 클래스를 생성할 수 없으므로 static으로 제공되는 getInstance() 메서드를 호출
//		Company company = new Company();
		Company company1 = Company.getInstance(); //클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
		Company company2 = Company.getInstance();
		
		System.out.println(company1 == company2); //두 변수가 같은 주소인지 확인함
		System.out.println(company1);
		System.out.println(company1);
	}

}
