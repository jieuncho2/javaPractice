package chapter08;
interface DataAccessObject{
	void select();
	void insert();
	void update();
	void delete();
}
class OracleData implements DataAccessObject{
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 검색");
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에 삽입");
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB를 수정");
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
	}
	
}
class MySqlData implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Mysql DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Mysql DB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Mysql DB를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Mysql DB에서 삭제");
	}
	
}
public class Exam15 {
	public static void dbWork(DataAccessObject dao){
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleData());
		dbWork(new MySqlData());
	}
}
