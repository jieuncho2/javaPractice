package chapter14;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte 배열로 읽기
//		자료를 read() 메소드로 한 바이트씩 읽는 것보다 배열을 사용해서 한꺼번에 많이 읽으면
//		처리 속도가 훨씬 빠르다
//		read(byte[] b) 메서드는 선언한 바이트 배열의 크기만큼 한꺼번에 자료를 읽는다
//		그리고 읽어 들인 자료의 수를 반환한다
		
		try(FileInputStream fis = new FileInputStream("./sample_file/input.txt")) {
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.println((char)b);
//				}
				for(int k = 0; k < i; k++) {
					System.out.println((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
