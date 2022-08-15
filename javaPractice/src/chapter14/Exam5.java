package chapter14;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		바이트 단위 스트림
//		
//		InputStream의 하위 스트림
//		FileInputStream: 파일에서 바이트 단위로 자료를 읽습니다.
//		ByteArrayInputStream: Byte 배열 메모리에서 바이트 단위로 자료를 읽습니다.
//		FilteInputStream: 기반 스트림에서 자료를 읽을 때 추가 가능을 제공하는 보조 스트림의 상위 클래스
//		
//		InputStream에서 제공하는 메서드
//		int read(): 입력 스트림으로부터 한 바이트의 자료를 읽습니다. 읽은 자료의 바이트 수를 반환
//		void close(): 입력 스트림과 연결된 대상 리소스를 닫습니다.
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./sample_file/input.txt"); //input.txt 파일 스트림 생성
			
			System.out.println((char)fis.read()); //A
			System.out.println((char)fis.read()); //B
			System.out.println((char)fis.read()); //C
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		} 
		finally {
			try {
				fis.close(); //열린 스트림은 finally 블록에서 닫음
			} catch (IOException e) {
				// TODO: handle exception
			} catch (NullPointerException e) { //스트림이 null인 경우
				// TODO: handle exception
			}
		}
		System.out.println("end"); //end
		
	}

}
