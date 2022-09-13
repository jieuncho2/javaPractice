package db;

/*
 JDBC Java DataBase Connectivuty
 Java 프로그램에서 관계형 데이터베이스 RDMS와 연동할 수 있도록 제공하는 표준 API
  
 */

public class LoadDriver {
	//Driver 클래스를 로드
	public static void loadDriver() {
		try {
			//org.mariadb.jdbc.Driver 클래스를 메모리에 로딩해 준다.
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver Load Success!");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadDriver();
	}

}
