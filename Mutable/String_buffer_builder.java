
public class String_buffer_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer string = new StringBuffer("hello");
		System.out.println(string.capacity());
		//initial capacity
		StringBuffer str = new StringBuffer();
		System.out.println(str.capacity());
		
		//input as append()
		StringBuffer s1= new StringBuffer("hello world hiiiiiiiiiiii");
		s1.append("This");
		s1.append(" is ");
		s1.append("wow");
		System.out.println(s1);
		System.out.println(s1.capacity());

	}

}
