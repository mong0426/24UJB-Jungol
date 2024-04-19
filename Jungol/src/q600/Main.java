package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(text);
		int tokensCount = stringTokenizer.countTokens();
		sc.close();
		
		System.out.println(tokensCount);
	}

}

//2nd case
	Scanner sc = new Scanner(System.in);
	String inp = sc.nextLine();
	sc.close();
	
	System.out.println(inp);
	
	int cnt = 1;
	for(int i=0;i<inp.length();i++) {
		if(inp.charAt(i)==' ') {
			cnt++;
		}
	}
	
	System.out.println(cnt);
	
//3rd case
	public class Main {

		   public static void main(String[] args) throws IOException {
		      // TODO Auto-generated method stub
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      StringTokenizer st = new StringTokenizer(br.readLine());
		      System.out.println(st.countTokens());
		      br.close();
		   }

