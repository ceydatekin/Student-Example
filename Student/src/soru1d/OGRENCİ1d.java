package soru1d;

import java.util.Scanner;

public class OGRENC�1d {
	String ad_soyad="ceyda tekin";
	public static void main(String[] args) {
		// bir double dizisinin ilk 4 eleman�n�n toplam�n� ekrana yaz�n�z
		int n, m, a = 0;
		int toplam = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("l�tfen matrisinizin ka� sat�rdan olu�acag�n� giriniz:");
		n = s.nextInt();
		System.out.println("l�tfen matrisinizin ka� sat�rdan olu�acag�n� giriniz:");
		m = s.nextInt();
		System.out.println("matrisimizn elmanlar�n� doldural�m l�tfen:");
		int dizi[][] = new int[n][m];
		int i = 0;
		while( i < n) {
			int j = 0;
			while ( j < m ) {
				dizi[i][j] = s.nextInt();
				j++;
			}
			i++;
		}
		i = 0;
		while ( i < n) {
		    int k = 0 ;
			while ( k < m ) {
				if (a < 4) {
					toplam += dizi[i][k];
					a++;
				} else
					break;
				k++;
			}
			i++;
		}

		System.out.println("sonucunuz " + toplam);

	}


}
