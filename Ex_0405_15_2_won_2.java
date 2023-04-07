package ex_0405;

import java.util.Scanner;

public class Ex_0405_15_2_won_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 0, h = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름과 높이를 입력하세요");
		
		r = sc.nextInt(); 	// sc.next(); //sc.nextline() //sc.nextFloat()
		h = sc.nextInt();

		
	
		float p = 3.14f;
		float result = r * r  * p * h;

		System.out.println("부피는 " + result);


	}

}
