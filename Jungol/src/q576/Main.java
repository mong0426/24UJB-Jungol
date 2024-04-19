package q576;

import java.util.Scanner;

public class Main {
	
	public static void calc(int p1, char o, int p2) {
		int ret = 0;
		
		if(o=='+') {
			ret = p1 + p2;
		}else if(o=='-') {
			ret = p1 - p2;
		}else if(o=='*') {
			ret = p1 * p2;
		}else if(o=='/') {
			ret = p1 / p2;
		}else{
			ret = 0;
		}
		
		System.out.printf("%d %c %d = %d\n", p1, o, p2, ret);
	}

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		Pattern p = Pattern.compile("\\d+|\\D");
//		Matcher m = p.matcher(input);
//		
//		while (m.find()) {
//			String split = m.group();
//			list.add(split);
//		}
//		
//		Stack<String> s = new Stack<>();
//		
//		for(int i=0;i<list.size();i++) {
//			if(!s.isEmpty() && s.peek().equals("*")) {
//				s.pop();
//				
//				String pop = s.pop();
//				
//				s.push(String.valueOf(Integer.parseInt(pop)*Integer.parseInt(list.get(i))));
//			}else {
//				s.push(list.get(i));
//			}
//		}		return result;

		
		//1st case
		Scanner sc = new Scanner(System.in);
		int opr1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int opr2 = sc.nextInt();
		sc.close();
		
		calc(opr1, op, opr2);
		
		
		
	}

}

