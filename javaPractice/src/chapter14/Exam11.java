package chapter14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//파일 복사 프로그램
		
		//파일 입출력에 관계된 입출력 스트림을 각각 생성
		FileInputStream fis = null;
		FileOutputStream fos = null;
		fis = new FileInputStream("./sample_file/input.txt"); //읽어올 파일의 경로 지정
		fos = new FileOutputStream("./sample_file/result.txt"); //저장할 파일명을 작성 프로젝트 폴더에 생성
		
		//각각 버퍼를 사용할 수 있도록 현재 입출ㄹ력 스트림의 인자를 받아서 보조 스트림의 인스턴스를 생성
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		//입력 스트림에서 읽어온 값이 -1이면 더 이상 읽어 올 값이 없음
		while((data = fis.read()) != -1) {
			bos.write(data);
		}
		
		//스트림도 외부와의 연결이기 때문에 반드시 close() 해야 함
		//연결한 반대 순서로 close()
		bos.close(); //사용한 스트림은 닫아 주기
		bis.close();
	}

}
