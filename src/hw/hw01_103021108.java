package hw;

import java.util.Scanner;
public class hw01_103021108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�п�J�C��q�e�ɶ�(����)");
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		if (v1 < 600) {
			System.out.println("�йq�ܶO(��))" + (v1 * 05));
		} else if (600 <= v1 && v1 <= 1200) {
			System.out.println("�йq�ܶO(��))" + (v1 * 05 * 0.9));
		} else if (v1 > 1200) {
			System.out.println("�йq�ܶO(��))" + (v1 * 05 * 0.79));
		}}}
