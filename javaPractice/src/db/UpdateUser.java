package db;

import java.sql.SQLException;
import java.util.Scanner;

class DBUpdate extends DBSelect {
	private User modifyUser() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);

		boolean validate = false;
		String validateTemp;
		do {
			System.out.println("정보 수정 할 회원의 아이디를 입력하세요. : ");
			user.userID = scanner.nextLine();
			System.out.println("회원의 이름를 입력하세요. : ");
			user.name = scanner.nextLine();
			System.out.println("회원의 나이를 입력하세요. : ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("회원의 직업를 입력하세요. : ");
			user.job = scanner.nextLine();

			System.out.println("수정된회원 : " + user.userID + " / " + user.name + " / " + user.age + " / " + user.job
					+ "이 맞습니까? (y/n)");

			validateTemp = scanner.next();

			validate = !validateTemp.equals("y");
		} while (validate);

		scanner.close();
		return user;
	}

	public void updateUser() throws SQLException {
		User user = modifyUser();
		String updateSQL = "UPDATE tUser SET name = ?, age = ?, job = ? WHERE userID = ?";

		preparedStatement = conn.prepareStatement(updateSQL);

		preparedStatement.setString(1, user.name);
		preparedStatement.setInt(2, user.age);
		preparedStatement.setString(3, user.job);
		preparedStatement.setString(4, user.userID);

		int cnt = preparedStatement.executeUpdate();

		if (cnt > 0) {
			System.out.println("영향받은 데이터: " + cnt);
			System.out.println("데이터 수정에 성공했습니다.");
		} else {
			System.out.println("데이터 수정에 실패했습니다.");
		}
	}
}

public class UpdateUser {
	public static void main(String[] args) throws SQLException {
		DBUpdate myDB = new DBUpdate();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.updateUser();
		myDB.getAllUser();
		myDB.closeDB();
	}
}
