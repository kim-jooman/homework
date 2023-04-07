package ex_0405;

import java.util.Scanner;

public class Ex_0405_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jumsu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		jumsu = sc.nextInt(); 	// sc.next(); //sc.nextline() //sc.nextFloat()

		if(jumsu >= 60 ) {
		
			System.out.println("합격");
		}
		else if(jumsu < 60 ) {
			
			System.out.println("불합격");
		
		}

	}
}