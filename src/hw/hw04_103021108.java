package hw;

import java.util.Scanner;
public class hw04_103021108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入一整數...公式n*(n+1)");
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int sum=0;
		for(int i=1;i<=v1;i++){
			sum+=i*(i+1);
		}
		System.out.println("結果"+sum);
		}}
