package chapter11;

import java.io.FileInputStream;
import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs = new FileInputStream(".\\sample_file\\sample.txt");
			Scanner sc = new Scanner(fs);
			while (sc.hasNext()) { // 값이 존재하면 계속해서 반복
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
