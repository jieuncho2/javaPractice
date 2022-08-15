package chapter14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam12 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//스트림 예외 처
		
		//파일 복사 프로그램
		
		//파일 입출력에 관계된 입출력 스트림을 각각 생성
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//각각 버퍼를 사용할 수 있도록 현재 입출ㄹ력 스트림의 인자를 받아서 보조 스트림의 인스턴스를 생성
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;;
		
		try {
			//데이터를 읽어 오는 것과 데이터를 전송하는 코드를 삽
			fis = new FileInputStream("./sample_file/input.txt"); //읽어올 파일의 경로 지정
			fos = new FileOutputStream("./sample_file/result.txt"); //저장할 파일명을 작성 프로젝트 폴더에 생성
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int data;
			//입력 스트림에서 읽어온 값이 -1이면 더 이상 읽어 올 값이 없음
			while((data = fis.read()) != -1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			//예외 발생 여부와 상관없이 사용한 스트림을 닫아줌
			//close()도 예외가 발생할 수 있어서 try-catch문 사용
			try {
				//연결한 반대 순서로 close()
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
