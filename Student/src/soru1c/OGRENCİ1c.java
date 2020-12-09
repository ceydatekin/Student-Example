package soru1c;

import java.util.Scanner;

public class OGRENCÝ1c {
	String ad_soyad="ceyda tekin";
	public static void main(String[] args) {
		// bir String dizinin 5. elemanýna kadar olan deðerleri ekrana yazýnýz.
		String dizi[] = new String[10];
		Scanner x = new Scanner(System.in);
		int i = 0;
		while ( i < dizi.length ) {
			
			System.out.print("lütfen " + (i + 1) + ". metninizi giriniz: ");
			dizi[i] = x.nextLine();
			i++;
		}

		i = 0;
		while ( i < 5 ) {
			
			System.out.println((i + 1) + ".elemanýnýz : " + dizi[i]);
			i++;
		}
	}
}
