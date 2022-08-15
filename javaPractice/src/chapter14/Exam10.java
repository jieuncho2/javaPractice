package chapter14;

import java.io.FileOutputStream;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		파일에 바이트 배열로 출력하기
//		write(byte[] b, int off, int len) 메소드 사용하기
//		배열의 전체 자료를 출력하지 않고 배열의 off 위치에서 len 길이만큼 출력
		try(FileOutputStream fos = new FileOutputStream("./sample_file/input.txt")) {
			byte[] bs = new byte[26];
			byte data = 65; //'A'의 아스키 값
			for(int i = 0; i < bs.length; i++) { //A~Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); //배열의 2번째 위피부터 10개 바이트 출력하기
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
