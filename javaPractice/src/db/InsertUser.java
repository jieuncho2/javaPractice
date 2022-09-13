package db;

import java.sql.SQLException;
import java.util.Scanner;

class User { // 회원 데이터 정의. 모델 클래스
	public String userID;
	public String name;
	public int age;
	public String job;
}

// 인서트
class DBInsert extends DB {
	private User setUser() {
		// 콘솔로 입력을 받음
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("신규 회원의 아이디를 입력하세요. (영어나 숫자, 이전 데이터에서 사용한 값은 안 됨");
			user.userID = scanner.next();
			System.out.println("신규 회원의 이름를 입력하세요.");
			user.name = scanner.next();
			System.out.println("신규 회원의 나이를 입력하세요. (숫자만)");
			user.age = scanner.nextInt();
			System.out.println("신규 회원의 직업를 입력하세요.");
			user.job = scanner.next();
			
			System.out.println("신규 회원: " + user.userID + " / " + user.name + " / " + user.age + " / " + user.job + "이 맞습니까? (y/n)");
			validateTemp = scanner.next(); // 입력 값 저장
			
			validate = !validateTemp.equals("y"); //
			//
		} while (validate);
		
		scanner.close();
		return user;
	}
	
	public void insertUser() throws SQLException {
		
		User user = setUser();
		
		String insertSql = "INSERT INTO tUser (userID, name, age, job ) VALUES (?, ?, ?, ?)";
		
		preparedStatement = conn.prepareStatement(insertSql);
		
		preparedStatement.setString(1, user.userID);
		preparedStatement.setString(2, user.name);
		preparedStatement.setInt(3, user.age);
		preparedStatement.setString(4, user.job);
		
		int rows = preparedStatement.executeUpdate();
		
		if(rows == 1) {
			System.out.println("데이터 입력에 성공했습니다.");
		} else {
			System.out.println("데이터 입력에 실패했습니다.");
		}
	}
}

public class InsertUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBInsert myDB = new DBInsert();
		myDB.connectDB();
		myDB.insertUser();
		myDB.closeDB();
	}

}
