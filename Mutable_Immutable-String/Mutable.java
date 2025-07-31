
public class Mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer string = new StringBuffer("hello");
		System.out.println(string.capacity());
		//initial capacity
		StringBuffer str = new StringBuffer();
		System.out.println(str.capacity());
		System.out.println("---");
		//input as append()
		StringBuffer s1 = new StringBuffer("hello");
		s1.append("hello");
		s1.append(" world");
		System.out.println(s1);
		System.out.println("length: " + s1.length());
		System.out.println("capacity: " + s1.capacity()); 
		System.out.println("---");
		
		//input as insert()
		StringBuffer s2 = new StringBuffer();
		s2.append("hello");
		s2.append("world is full of mystry");
		System.out.println(s2);
		System.out.println("Length: " + s2.length());
		System.out.println("Capacity: " + s2.capacity());

		
	}

}
