package ex;

import java.util.Scanner;
public class ex01_103021108 {
	public static void  main(String[] avg){
		   Scanner scn=new Scanner(System.in);
		   String str = scn.next();
		   char[] A = str.toCharArray();
		   int sum = 0,i;
		   for(i=0;i<A.length;i++){
		      sum += Integer.parseInt(A[i]+"");
		      System.out.print(A[i]);
		      if(i==A.length-1){
		    	  System.out.print("=");
		      }
		      else{
		    	  System.out.print("+");
		      }
		   }
		   System.out.println(sum);
}
}
