package mylisthomework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Mylist mylist=new Mylist();
		
		mylist.add("istanbul");
		
		boolean result=mylist.contains("istanbul");
		System.out.println(result);
		mylist.remove("istanbul");
		mylist.add("ankara");
		mylist.add("izmir");
		mylist.remove(1);
		
		String a = mylist.get(0);
		System.out.println(a);
		
		mylist.list();

	}

}
