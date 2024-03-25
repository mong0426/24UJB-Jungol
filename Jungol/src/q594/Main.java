package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		for(int i=0;i<100;i++) {
			System.out.println(str);
		} System.out.println();
		
	      
		// 2번
			
	      Scanner sc1 = new Scanner(System.in);
	      String val;
	      val = sc1.next();
	      sc1.close();
	      {
	      System.out.println(val.repeat(2));
	      }
	   }
}


