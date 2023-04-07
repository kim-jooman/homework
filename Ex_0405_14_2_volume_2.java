package ex_0405;

import java.util.Scanner;

public class Ex_0405_14_2_volume_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w = 0, d = 0, h = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로, 세로, 높이를 입력하세요");
		
		w = sc.nextInt(); 	// sc.next(); //sc.nextline() //sc.nextFloat()
		d = sc.nextInt();
		h = sc.nextInt();
		
		
		int result = w * d * h;

		System.out.println("부피는 " + result);


	}

}
