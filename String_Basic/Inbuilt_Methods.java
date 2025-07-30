
public class Inbuilt_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Java";
		String s11= "Java";
		
		String s2= "Python";
		
		
		String s3= "Java"+"Python";
		String s4= "Java"+"Python";
		
		//the below comes under heap-> because we used concat inbuilt method 
		String s311= "Java".concat("Pythons");
		String s411= "Java"+"Pythons";
		
		//the below checks the value is same not not
		if(s311.equals(s411)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println(s311);
		String s5= s1+s2;
		String s6= s1+s2;
		
		
		String s31= s1+"Python";
		String s41= "Java"+s2;		
		
		
		if(s1==s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal");
		}
		/*output:
		 * Unequal
		 * 
		 * reason:
		 * no new, 
		 * so Java and python are stored in string pool segment of different reference
		 * 
		 * repetition are not allowed 
		 * so it will create a reference for that object
		*/
		
		
		if(s11==s1) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal");
		}
		/*
		 * output:
		 * equal
		 * 
		 * reason:
		 * no new 
		 * here s11 and s1 have same name as Java 
		 * 
		 * repetition are not allowed 
		 * so it will create a same reference for that object
		 * 
		 */
		if(s3==s4) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal");
		}
		
		if(s5==s6) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal");
		}
/*
 * heap ->two parts
 * 1). string constant pool
 *		->repetitions are not allowed
 *		->so we are referring the variable for new reference object
 * 
 * 2). heap
 * 		->repetitions are allowed
 * 		->and we are referring the variable for new reference object
 * 
 * == -> checks the address is same or not
 * equals -> checks the value is same or not
 * compare -> checks and compare character by character
 * 
 * 
 */
		if(s11.equals(s1)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal");

		}
		
		
		
		
		
	}

}
