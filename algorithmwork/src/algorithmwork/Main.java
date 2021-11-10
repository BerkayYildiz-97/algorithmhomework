package algorithmwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ödev 1
		//Sayısal loto : 1-49
		//Oynanmak istenen kolon adedi kadar rastgele sayısal loto oynayınız. Dizilere atayıp yazdırınız.
		//Bir kolonda 6 sayı bulunur.
		//Bir kolonda sayılar tekrar edemez
		
		int column;			
		int[] array = new int[6];
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Oynamak istediğiniz kolon sayısını giriniz: ");
		column = s.nextInt();
		
		boolean found=false;
		int sayi=0;
		
		for (int i = 1; i < column+1 ; i++) {
			System.out.println(i + ".kolon "+ " ");
			for (int j = 0; j < array.length; j++) {
				sayi=random.nextInt(49)+1;
				found=false;
				for (int a : array) {
					if (a==sayi) {
						found=true;
						break;
					}
				}
				
				if (!found) {
					array[j]=sayi;
					System.out.println(array[j]+ " ");					
				}
				else {
					j--;
				}
			}
				
		}
		
	}

}
