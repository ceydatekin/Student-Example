package soru1a;

import java.util.Scanner;

public class OGRENCÝ1a {
	String ad_soyad="ceyda tekin";
	// bir String dizinin tüm elemanlarýný ekrana yazýnýz.

		public static void main(String[] args) {
			String isim[] = new String[1];
			Scanner x = new Scanner(System.in);
			for (int i = 0; i < 1; i++) {
				System.out.println("lütfen metin giriniz");
				isim[i] = x.nextLine();
			}

			yazdir(isim);

		}

		static void yazdir(String dizi[]) {
			System.out.println("yazdýgýnýz metin:");
			for (String i : dizi)
				System.out.println(i);
		}
}
