package q573;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
	}

}
/*
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      square();
   }

   public static void square() {
      int input;
      Scanner sc = new Scanner(System.in);
      input = sc.nextInt();
      for (int i = 1; i <= input * input; i++) {
         System.out.print(i + " ");
         if (i % input == 0) {
            System.out.println();
         }
      }
      sc.close();
   }

}
*/