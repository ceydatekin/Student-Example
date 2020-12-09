package soru1d;

import java.util.Scanner;

public class OGRENCÝ1d {
	String ad_soyad="ceyda tekin";
	public static void main(String[] args) {
		// bir double dizisinin ilk 4 elemanýnýn toplamýný ekrana yazýnýz
		int n, m, a = 0;
		int toplam = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("lütfen matrisinizin kaç satýrdan oluþacagýný giriniz:");
		n = s.nextInt();
		System.out.println("lütfen matrisinizin kaç satýrdan oluþacagýný giriniz:");
		m = s.nextInt();
		System.out.println("matrisimizn elmanlarýný dolduralým lütfen:");
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
