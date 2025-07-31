public class Fivefive_Pattern{
	public static void main(String[] args) {
		System.out.println("N X N Square pattern");
		for (int i=0; i<=5; i++){
			for(int j=1; j<=5; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		/*N X N Square pattern
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * */
		System.out.println();
		System.out.println("N X N Hallow Square pattern");
		for(int a=1; a<=5; a++){
			for (int b=1; b<=5; b++){
				if(a==1 || b==1 || a==5 || b==5){
					System.out.print("* ");
				}
				else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		/*N X N Hallow Square pattern
		* * * * * 
		* - - - * 
		* - - - * 
		* - - - * 
		* * * * * */
		System.out.println();
		System.out.println("n*n number pattern - 1");
		int incrr=1;
		for(int ii=1; ii<=5; ii++) {
			for (int jj=1; jj<=5 ; jj++) {
				System.out.print(jj+" ");
				incrr++;
			}
			System.out.println();
		}
		/*n*n number pattern - 1
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 */
		System.out.println();
		System.out.println("n*n number pattern - 1");
		for(int ij=1; ij<=5; ij++) {
			for (int ji=1; ji<=5 ; ji++) {
				System.out.print(ij+" ");
			}
			System.out.println();
		}
		/*n*n number pattern - 1
			1 1 1 1 1 
			2 2 2 2 2 
			3 3 3 3 3 
			4 4 4 4 4 
			5 5 5 5 5 */
		System.out.println();
		System.out.println("table incrementation");
		for (int c=1; c<=5; c++) {
			for (int d=1; d<=5; d++) {
				int result=c*d;
				if(result>=10) {
					System.out.print(result+" ");
				}
				else {
					System.out.print("0"+result+" ");
				}
			}
			System.out.println();
			/*table incrementation
			01 02 03 04 05 
			02 04 06 08 10 
			03 06 09 12 15 
			04 08 12 16 20 
			05 10 15 20 25 */
		}
		System.out.println();
		System.out.println("number incrementation");
		int incr=1;
		for(int cc=1; cc<=5; cc++) {
			for(int dd=1; dd<=5; dd++) {
				if(incr>=10) {
					System.out.print(incr+" ");
				}
				else {
					System.out.print("0"+incr+" ");
				}
				incr++;
			}
			System.out.println();
		}
		/*number incrementation
		01 02 03 04 05 
		06 07 08 09 10 
		11 12 13 14 15 
		16 17 18 19 20 
		21 22 23 24 25 */
		
		System.out.println();
		System.out.println("addition of number in row alternatively");
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print((row+col-1)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle-1");
		for(int roww=1;roww<=5;roww++){
			for(int coll=1;coll<=roww;coll++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle-2");
		for(int ij=1;ij<=5;ij++){
			for(int ji=ij;ji<=5;ji++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle-3");
		for(int roww=1;roww<=5;roww++){
			for(int coll=1;coll<6-roww;coll++){
				System.out.print("  ");
			}
			for(int colll=1;colll<=roww;colll++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle-4");
		for(int roww=1;roww<=5;roww++){
			for(int coll=1;coll<roww;coll++){
				System.out.print("  ");
			}
			for(int colll=1;colll<=6-roww;colll++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle-5");
		for(int roww=1;roww<=5;roww++){
			for(int coll=1;coll<6-roww;coll++){
				System.out.print(" ");
			}
			for(int colll=1;colll<=roww;colll++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Triangle-6");
		for(int roww=1;roww<=7;roww++){
			for(int coll=1;coll<roww;coll++){
				System.out.print(" ");
			}
			for(int colll=1;colll<=8-roww;colll++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("number-1");
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("number-2");
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("number-1");
		int cou=1;
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(cou+" ");
				cou++;
			}
			System.out.println();
		}
		}
	}