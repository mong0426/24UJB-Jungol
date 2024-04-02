package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = '\0'; //null로 초기화 시키는 방법
		
		for(;;) {
		inp = sc.next().charAt(0);
//		System.out.println(inp);
		
		// 2. java style
		if(Character.isAlphabetic(inp)) {
			System.out.println(inp);
		}else if(Character.isDigit(inp)) {
			System.out.println((int)inp);
		}else {
			sc.close();
			break;
		}
		
		// 1. c style
//		if(('a' <= inp && inp <= 'z')
//				||('A' <= inp && inp<= 'Z')){ //알파벳
//			System.out.println(inp);
//		}else if('0' <= inp && inp <= '9') { //숫자
//				System.out.println((int)inp);
//				
//		}else { //기타문자
//
//			sc.close();
//			break;
//		}
		}
		

	}

}
