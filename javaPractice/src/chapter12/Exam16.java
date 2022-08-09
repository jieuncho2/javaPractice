package chapter12;

import java.util.ArrayList;
import java.util.List;

//BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴
//main() 메소드 실행시에 아래와 같이 출력될 수 있도록 BoardDao의 getBoardList() 메소드를 작성할 것

class Board {
	private String title;
	private String content;

	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

}

class BoardDao{
//	코드 작성
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}
	
}

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
//		제목1-내용1
//		제목2-내용2
//		제목3-내용3
	}

}
