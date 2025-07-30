
public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Java";
		String s2= "JAVA";
		
		int n= s1.compareTo(s2);
		int n1= s1.compareToIgnoreCase(s2);
		
		if(n>0) {
			System.out.println("s1 is greater than s2");
		}
		else if(0<n){
			System.out.println("s2 is greater than s1");
		}
		else {
			System.out.println("s1 and s2 are equal");
		}
		
		System.out.println(n);
		
		String s111= "Javaa";
		String s112= "JAVA";
		boolean n11= s111.equalsIgnoreCase(s112);
		System.out.println(n11);
		
		String a111= "Java";
		String a112= "JAVA";
		boolean a1= a111.equalsIgnoreCase(a112);
		System.out.println(a1);
		
		
		//IgnoreCase -> ignore case sensitivity
		
		
		
		if(n1>0) {
			System.out.println("s1 is greater than s2");
		}
		else if(0<n1){
			System.out.println("s2 is greater than s1");
		}
		else {
			System.out.println("s1 and s2 are equal");
		}
		
		System.out.println(n1);
		System.out.println("scenario-1");
		String s11= "JAVAA";
		String s21= "JAVA";
		int n2= s11.compareTo(s21);
		System.out.println(n2);
		
		String b= "hello";
		System.out.println(b);//hello
		b.concat("world");
		System.out.println(b);//helloword(garbage)
		String c= b.concat("world");//helloworld
		String c1=c.concat("hellooo");//helloworldhellooo
		System.out.println(c1);
		
		System.out.println("Scenario-2");
		String m1="welcome";
		System.out.println(m1);
		String m2=m1.concat("elaks");
		System.out.println(m2);
		m1=m2.concat("Wow");
		System.out.println(m1);
		
		//we are unable to create same variable twice
		// but we can change value of the variable
		
		
	}

}
