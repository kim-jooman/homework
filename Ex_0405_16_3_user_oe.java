package ex_0405;

import java.util.Scanner;

public class Ex_0405_16_3_user_oe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		x = sc.nextInt(); 
		
		if ( x % 2 == 0 ) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}
