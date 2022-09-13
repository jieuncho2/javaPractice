package db;

import java.sql.SQLException;
import java.util.Scanner;

class DBDelete extends DBSelect {
	public void deleteUser() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삭제할 유저의 아이디를 입력하세요. : ");
		String userID = scanner.nextLine();
		
		String deletSQL = "DELETE FROM tUser WHERE userID = '" + userID  + "' ";
		
		preparedStatement = conn.prepareStatement(deletSQL);
		int cnt = preparedStatement.executeUpdate();
		
		if (cnt > 0) {
			System.out.println("영향받은 데이터: " + cnt);
			System.out.println("데이터 삭제에 성공했습니다.");
		} else {
			System.out.println("데이터 삭제에 실패했습니다.");
		}
		scanner.close();
	}
}

public class DeleteUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBDelete myDB = new DBDelete();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.deleteUser();
		myDB.closeDB();
	}

}
