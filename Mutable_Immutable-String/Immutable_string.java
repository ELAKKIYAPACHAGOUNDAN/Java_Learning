
public class Immutable_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Hello World";
		System.out.println(s1.length());// to find length
		System.out.println(s1.toUpperCase());// changed to uppercase
		System.out.println(s1.toLowerCase());// changed to lowercase
		System.out.println(s1.charAt(6));//returns character from the index
		System.out.println(s1.indexOf('W'));//returns position of the index
		System.out.println(s1.startsWith("Hello"));//returns in boolean type
		System.out.println(s1.startsWith("ello"));//false
		System.out.println(s1.endsWith("Hello"));//false
		System.out.println(s1.endsWith("d"));//true
		
		String s2= "This,world,is,full,of,mystery";	
		System.out.println(s2.indexOf('l'));//8
		System.out.println(s2.lastIndexOf('l'));//17
		String s3="hello elakk";
		String s4="hello";
		System.out.println("Replaced character :"+s3.replace("elakks","Elakkiya"));
		//hello Elakkiya
		System.out.println(s3.isEmpty());//false
		System.out.println(s4.isEmpty());//true
		System.out.println(s3.compareTo(s4));
		String[] array = s2.split(",");
		for (String string : array) {
			System.out.println(string);
		}
		char[] arrayy= s4.toCharArray();
		for(char res: arrayy){
			System.out.println(res);
		}
	}
}