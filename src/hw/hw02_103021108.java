package hw;

import java.util.Scanner;
public class hw02_103021108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�ʧO(1:�k��,2:�k��):");
		int genda=scn.nextInt();
		System.out.print("����");
		int h = scn.nextInt();
		if(genda==1){
			System.out.println("�з��魫��"+((h-80)*0.7));	
		}else{
	    if(genda==2){
	    	System.out.println("�з��魫��"+((h-70)*0.6));
	    }else{
	    	System.out.println("�ʧO��J���~");
}}}}
