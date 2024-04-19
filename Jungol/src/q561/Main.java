package q561;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }



        for(int i = 0; i < intArray.length; i++) {
           
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<intArray.length;i++) {
        	if(intArray[i] < 100 && intArray[i] > max) {
        		max = intArray[i];
        	}
        	if(intArray[i] >= 100 && intArray[i] < min) {
        		min = intArray[i];
        	}
        }
        System.out.println(max + " " + min);


    }

}