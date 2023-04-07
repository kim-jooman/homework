package ex_0405;

import java.util.Scanner;

public class Ex_0405_16_1_abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요!");
		x = sc.nextInt(); 

		
		
		int absX = x >= 0 ? x : -x;
		System.out.println(absX);
		

	}

}
