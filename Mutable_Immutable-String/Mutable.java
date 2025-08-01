
public class Mutable {

	public static void main(String[] args) {
		System.out.println("StringBuffer: ");
		StringBuffer string = new StringBuffer("hello");
		System.out.println(string.capacity());
		System.out.println(string.length());
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
		s2.append("This is a test which is used to test the StringBuffer class");
		System.out.println(s2);
		System.out.println("Length: " + s2.length());
		System.out.println("Capacity: " + s2.capacity());
		System.out.println("---");
		s2.insert(5, " world");
		System.out.println("after insertion: " + s2);
		s2.delete(3,10);
		System.out.println("after deletion: " + s2);
		System.out.println("Length: " + s2.length());

		System.out.println("-----");
		System.out.println("StringBuilder: ");

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.capacity());
		//initial capacity
		System.out.println(sb.length());
		sb.delete(1,3);
		System.out.println("after deletion: " + sb);
		sb.append(" world");
		System.out.println("after append: " + sb);
		System.out.println("Length: " + sb.length());	
		System.out.println("Capacity: " + sb.capacity());
		sb.insert(2, "Java");
		System.out.println("after insertion: " + sb);
		System.out.println("Length: " + sb.length());


		//StringBuilder vs StringBuffer
		//StringBuffer is synchronized, hence it is thread-safe but slower than StringBuilder.
		//StringBuilder is not synchronized, hence it is faster than StringBuffer.

		
	}

}
