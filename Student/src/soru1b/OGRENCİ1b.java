package soru1b;

import java.util.Scanner;

public class OGRENC�1b {
	String ad_soyad="ceyda tekin";
	public static void main(String[] args) {
		// bir double matrisinin elemanlar�n� ekrana yaz�n�z.
		Scanner x = new Scanner(System.in);
		double dizi[][] = new double[3][3];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				System.out.print("l�tfen dizinin " + (i + 1) + "." + (j + 1) + ". eleman�n� giriniz:");
				dizi[i][j] =x.nextDouble();
			}
		}
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				System.out.print(dizi[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
