package soru1c;

import java.util.Scanner;

public class OGRENC�1c {
	String ad_soyad="ceyda tekin";
	public static void main(String[] args) {
		// bir String dizinin 5. eleman�na kadar olan de�erleri ekrana yaz�n�z.
		String dizi[] = new String[10];
		Scanner x = new Scanner(System.in);
		int i = 0;
		while ( i < dizi.length ) {
			
			System.out.print("l�tfen " + (i + 1) + ". metninizi giriniz: ");
			dizi[i] = x.nextLine();
			i++;
		}

		i = 0;
		while ( i < 5 ) {
			
			System.out.println((i + 1) + ".eleman�n�z : " + dizi[i]);
			i++;
		}
	}
}
