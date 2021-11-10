package algorithmwork;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ödev2, Bir dizide tekrar eden sayıları çıkararak yeni dizi oluştunuz.
		
		int[] array= {2,5,10,15,5,9,2};
		
		for (int i = 0; i < array.length; i++) {
			int ctrl=0;
			
			for (int j = 0; j < i; j++) {
				if (array[i]==array[j]) {
					ctrl=1;
					break;
				}
			}
			if (ctrl==0) {
				System.out.println(array[i]+ " ");
			}
		}

	}

}
