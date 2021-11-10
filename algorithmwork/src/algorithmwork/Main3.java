package algorithmwork;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ödev3 , Bir dizideki sayıları tersten sıralayarak yeni dizi oluşturunuz. Hazır
		// fonksiyon kullanılmayacak
		// Büyükten küçüğe sıralanacak

		int[] sayilar = { 1, 5, 3, 7, 9, 8 };

		int n = sayilar.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (sayilar[j - 1] < sayilar[j]) {

					temp = sayilar[j - 1];
					sayilar[j - 1] = sayilar[j];
					sayilar[j] = temp;
				}

			}
		}
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(i+1 +". sayı " + sayilar[i]);
		}

	}

}
