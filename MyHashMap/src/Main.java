
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();

		myHashMap.put("Germany", "Berlin");
		myHashMap.put("Turkey", "Ankara");
		myHashMap.put("France", "Paris");
		
		myHashMap.list();
		myHashMap.size();
		System.out.println(myHashMap.getStringKey("France"));
		System.out.println(myHashMap.getStringKey("Turkey"));
		
		
		System.out.println("*************");
		
		myHashMap.remove("France");
		myHashMap.list();
		System.out.println("*************");
		
		MyHashMap<String, Integer> myHashMap2 = new MyHashMap<String, Integer>();
		//isim, yaş
		myHashMap2.put("Berkay", 24);
		myHashMap2.put("Mustafa", 27);
		myHashMap2.list();
		//myHashMap2.get("Berkay");
		
		System.out.println("************");
		myHashMap2.size();
		myHashMap2.remove("Mustafa");
		myHashMap2.list();
		
		System.out.println("***********");
		myHashMap2.clear();
		myHashMap2.list();
		
		MyHashMap<Integer, String> myHashMap3 = new MyHashMap<Integer, String>();
		myHashMap3.put(0, "Galatasaray");
		System.out.println(myHashMap3.getIntKey(0));
		
		
		
		
		

	}

}
