package chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam9 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		파일에 바이트 배열로 출력하기
//		write(byte[] b) 메소드는 바이트 배열에 있는 자료를 한꺼번에 출력
		
		FileOutputStream fos = new FileOutputStream("./sample_file/input.txt", true);
		try(fos){ //java 9부터 제공되는 기
//		try(FileOutputStream fos = new FileOutputStream("./sample_file/input.txt", true); //java 8까지
			byte[] bs = new byte[25];
			byte data = 65; //'A'의 아스키 값
			for(int i = 0; i <bs.length; i++) { //A~Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs); //배열 한꺼번에 출력하기
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
