package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class DBSelect extends DB {

	Scanner scanner = new Scanner(System.in);
	protected ResultSet querySelect(String sql) {	
		try {
			preparedStatement = conn.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
		} catch(SQLException e) {
			System.out.println("error: " + e);
		} return resultSet;
	}
	

	private void printUser(String sql) throws SQLException {
		// TODO Auto-generated method stub
		int totalRow;
		int num = 1;
		ResultSet resultSet = querySelect(sql);

		resultSet.last();
		totalRow = resultSet.getRow();
		resultSet.beforeFirst();
		if (totalRow == 1) {
			// 데이터가 하나
			if (resultSet.next()) {
				System.out.println("아이디: " + resultSet.getString(1));
				System.out.println("이름: " + resultSet.getString(2));
				System.out.println("나이: " + resultSet.getString(3));
				System.out.println("직업: " + resultSet.getString(4));
				System.out.println();
			} else {
				System.out.println("입력한 아이디의 데이터는 존재하지 않습니다.");
			}
		} else {
			// 전체 목록 출력
			// 데이터의 처음부터 읽어오므로 next를 만나면 한 줄을 읽어오고 다음 줄로 커서가 이동
			// 한줄한줄 내려가면서 데이터를 가져오고 데이터가 끝까지 가면 종료
			while (resultSet.next()) {
				System.out.println(num + "번째 회원");
				System.out.println("아이디: " + resultSet.getString(1));
				System.out.println("이름: " + resultSet.getString(2));
				System.out.println("나이: " + resultSet.getString(3));
				System.out.println("직업: " + resultSet.getString(4));
				System.out.println();
				num++;
			}
		}
	}

	public void getAllUser() throws SQLException {
		String sql;
		System.out.println("전체 회원 목록입니다.");
		sql = "SELECT * FROM tUser ";
		printUser(sql);
		System.out.println("==============");
	}

	public void getOneUser() throws SQLException {
		// TODO Auto-generated method stub
		String sql;
		String userID;
		String validateTemp;
		boolean validate = false;

		do {
			System.out.print("정보 검색 할 회원의 아이디를 입력하세요. : ");
			userID = scanner.next();

			System.out.println("검색할 회원의 아이디가 " + userID + "이 맞습니까? (y/n)");
			validateTemp = scanner.next();
			validate = !validateTemp.equals("y");

		} while (validate);
		sql = "SELECT * FROM tUser WHERE userID = '" + userID + "'";

		printUser(sql);
	}
}

public class SelectUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBSelect myDB = new DBSelect();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.getOneUser();
		myDB.closeDB();
	}

}
