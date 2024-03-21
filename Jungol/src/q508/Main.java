package q508;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2n
/*		System.out.printf("%10s%10s%10s\n","item", "count", "price");
		System.out.printf("%10s%10s%10s\n","pen", "20", "100");
		System.out.printf("%10s%10s%10s\n","note", "5", "95");
		System.out.printf("%10s%10s%10s\n","eraser", "110", "97");
	}

}
*/
		//1n
		int pen = 5;
		int note = 19;
		int eraser = 13;
		int a=20;
		int b=5;
		int c=110;
		
		int result1 = a*pen;
		int result2 = b*note;
		int result3 = c-eraser;
				
		System.out.println("      item" + "     count" +"     price");
		System.out.println("       pen" + "        "+a +"       "+result1);
		System.out.println("      note" + "         "+b +"        "+result2);
		System.out.println("    eraser" + "       "+c +"        "+result3);
	}

}
