package db;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

/*
DBMS와 연결하기
java.sql 패키지가 제공하는 Connection 객체를 사용
Connection 객체는 역시 java.sql 패키지에 포함되어 있는 DriverManager 클래스의 getConnection 메서드를 이용
getConnection(String url, String user, String password) 메서드는 static 메서드로서
url은 서버와 데이터베이스 위치를 나타내고 user는 사용자 접속 아이디 password는 접속 비밀번호를 저장
*/

class DB {
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null; // 쿼리시에 결과를 저장하는 용도로 사용. select에 주로 사용
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3306";
		final String DB_NAME = "sample"; // 데이터베이스 이름
		final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
		
		final String DB_USER = "root";
		final String DB_PASS = "1225";
		
		// 디비 접속
		try {
			Class.forName(driver); // JDBC 드라이버 등록
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS); // 디비 연결
			if(conn != null) {
				System.out.println("DB 접속 성공");
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			if(resultSet != null) { // 열린 경우 닫음
				resultSet.close();
			}
			if(preparedStatement != null) { // 열린 경우 닫음
				preparedStatement.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB 접속 해제");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class ConnectDB {
	// Connection 객체를 생성해 DataBase 연결하기
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closeDB();
	}

}
