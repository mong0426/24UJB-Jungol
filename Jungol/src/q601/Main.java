package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		System.out.println(inp);

		for (int i = 1; i <= inp.length(); i++) {
			for (int j = inp.length() - i; j < inp.length(); j++) {
				System.out.print(inp.charAt(j));
			}
			for (int j = 0; j < inp.length() - i; j++) {
				System.out.print(inp.charAt(j));
			}
			System.out.println();
		}
	}
}

//case 2
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next(); 
      sc.close();
      String[] cut = a.split(""); 

      for (int i = 0; i < cut.length; i++) {
         String back[] = Arrays.copyOf(cut, cut.length); // 배열 복사
         for (int j = 0; j < cut.length; j++) {
            if (j + 1 < cut.length) { // 마지막 인덱스제외를 한칸 옮김
               cut[j + 1] = back[j];
            } else if (j + 1 == cut.length) {
               cut[0] = back[cut.length - 1]; // 0번익덱스에 기존에 백업해둔 마지막 인덱스를 넣음
            }
            if (j == cut.length - 1) {
               String Join = String.join("", cut); // 배열을 ""(공백없이)로 합치면서 문자열로 변경
               System.out.println(Join);
            }
         }

      }

   }

}

//case 3
import java.util.LinkedList;
import java.util.Scanner;



public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      LinkedList<Character> list = new LinkedList<>();
      int cnt;
      String input = sc.next();
      sc.close();
      for(int i = 0; i < input.length(); i++) {
         list.add(input.charAt(i));
      }
      
      for(int i = 0; i < list.size(); i++) {
         cnt = list.size() - 1 - i;
         for(int j = 0; j < list.size(); j++) {
            System.out.print(list.get(cnt));
            cnt = (cnt + 1) % list.size();
         }
         System.out.println();
      }

   
   }
}

//case 3
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      sc.close();
      for (int i = 0; i < str.length(); i++) {
         char anw = str.charAt(str.length() - 1);
         String name = anw + str.substring(0, str.length() - 1);
         str = name;
         System.out.println(name);
      }
   }
}
