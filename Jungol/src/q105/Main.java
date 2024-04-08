package q105;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "Seoul";
//		String b = "10,312,545";
//		String c = "+91,375";
//		
//		String d = "Pusan";
//		String e = "3,567,910";
//		String f = "+5,868";
//		
//		String g = "Incheon";
//		String h = "2,758,296";
//		String i = "+64,888";
//		
//		String j = "Daegu";
//		String k = "2,511,676";
//		String l = "+17,230";
//		
//		String n = "Gwangju";
//		String m = "1,454,636";
//		String o = "+29,774";
//		
//		
//		System.out.printf("%15s%15s%15s\n", a,b,c);
//		System.out.printf("%15s%15s%15s\n", d,e,f);
//		System.out.printf("%15s%15s%15s\n", g,h,i);
//		System.out.printf("%15s%15s%15s\n", j,k,l);
//		System.out.printf("%15s%15s%15s\n", n,m,o);
		
		String[][] ar = {
				{ "Seoul", "10,312,545", " +91,375" },
				{ "Pusan", "3,567,910", "+5,868" },
				{ "Incheon", "2,758,296", "+64,888" },
				{ "Daegu", "2,511,676", "+17,230" },
				{ "Gwangju", "1,454,636", "+29,774" }
			};

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%15s", ar[i][j]);
			}
			System.out.println();
		}
	
		// 숫자 3자리 수 마다 콤마를 찍는 명령어
		DecimalFormat decFormat = new DecimalFormat("###,###");
		
		String str = decFormat.format(12300000);
		System.out.println(str);
		
		str = decFormat.format(50500);
		System.out.println(str);
		

	}

}
