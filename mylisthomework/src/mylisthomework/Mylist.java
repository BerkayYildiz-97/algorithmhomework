package mylisthomework;

public class Mylist {
	
	String[] array;
	
	public Mylist() {
		this.array= new String[0];
	}
	
	//ekleme
	public String[] add(String element) {
		String[] temparray = new String[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			temparray[i] = array[i];
		}
		temparray[temparray.length - 1] = element;
		array = new String[temparray.length];
		for (int i = 0; i < temparray.length; i++) {
			array[i] = temparray[i];
		}
		return array;
	}
	
	//içerik kontrol
	public boolean contains(String c) {
		boolean varMi=true;
		for (int i = 0; i < array.length; i++) {
			if (c == array[i]) {
				return varMi;
			}
		}
		varMi=false;
		return varMi;

	}
	
	//listele
	public void list() {
		for (String result : array) {
			System.out.println("liste: " + result);
		}
	}
	//eleman getirme
	public String get(int index) {
		return array[index];
	}
	
	public void remove(String element) {

		String[] temparray = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			temparray[i] = array[i];
		}

		array = new String[array.length - 1];
		int a = 0;
		for (int i = 0; i < array.length + 1; i++) {
			if (temparray[i] == element) {
				continue;
			} else {
				array[a] = temparray[i];
				
			}
			a++;
		}

	}
	
	public void remove(int index) {
		String[] temparray = new String[array.length];
		for (int i = 0; i < temparray.length; i++) {
			temparray[i] = array[i];
		}
		array = new String[temparray.length - 1];
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == index) {
				continue;
			}else {
				array[a] = temparray[i];
			}
			a++;
		}
		
	}


}
