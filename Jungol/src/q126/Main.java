package q126;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
		
	      ArrayList<Integer> num = new ArrayList<Integer>();
	      int odd = 0;
	      int even = 0;
	      int i = 0;
	      Scanner sc = new Scanner(System.in);
	      while (true) {
	         num.add(sc.nextInt());
	         if (num.get(i) % 2 == 1) 
	            odd++;
	         if (num.contains(0) == true)
	            break;
	         if (num.get(i) % 2 == 0)
	            even++;
	         i++;
	      }
	      System.out.println("odd : " + odd);
	      System.out.println("even : " + even);
	      sc.close();
	   }
	}

//      int evencount = 0;
//      int oddcount = 0;
//      while(true) {
//         int a = sc.nextInt();
//         if(a != 0 && a%2 == 0) {
//            evencount++;
//         }else if(a%2 == 1) {
//            oddcount++;
//         }else if(a == 0){
//            System.out.print("odd : " + oddcount + "\n" + "even : " + evencount);
//            break;
//         } 
//      }
//      sc.close();
//      }
//      for(;;) {
//         int q = sc.nextInt();
//         if(q == 0 ) {
//            System.out.println("odd : " + oddcount + "\n" + "even : " + evencount);
//            sc.close();
//            break;
//            }else {
//               switch((q%2)) {
//               case 1:
//                  oddcount++;
//                  break;
//               case 0:
//                  evencount++;
//                  break;
//               }
//      }
//   }
//
//}
//}
	
//		for(;;) {
//			int num = sc.nextInt();
//			
//			int a = num%2;
//			
//			if (a==0) {
//				int sum =+ a;
//				
//				System.out.println("odd : " + sum);
//			}else if(a==1){
//				int sum =+ a+1;
//				System.out.println("even : " + sum);
//			}else {
//				sc.close();
//				break;
//				
//			}
//		}
				
//
//	}
//
//}
