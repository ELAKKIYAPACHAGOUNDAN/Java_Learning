
public class Basic {
	public static void main(String args[]) {
		
		System.out.println("1D_Array: ");
		//static declaration method 1
		int[] array = new int[] {10,20,30,40,50};
		
		//static declaration method 2
		int[] arrays = {1,2,3,4,5,6};
		
		//static declaration method 3
		int[] arr= new int[5];
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<arrays.length; i++) {
			System.out.print(arrays[i]+" ");
		
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();
		System.out.println();

		System.out.println("2D_Array: ");
		//method 1
		int[][] a1= new int[3][4];
		a1[0][0]= 122;
		a1[0][1]= 121;
		a1[0][2]= 124;
		a1[0][3]= 123;
		
		
		a1[1][0]= 120;
		a1[1][1]= 129;
		a1[1][2]= 128;
		a1[1][3]= 127;
		
		a1[2][0]= 12;
		a1[2][1]= 121;
		a1[2][2]= 123;
		a1[2][3]= 14;
		
		
		//method 2
		int[][] a2= {{1,2,3,4},{2,3,4,5,},{3,4,5,6}};
		
		//method 3
		int[][] a3= new int[][] {{1,2,3,4},{2,3,4,5,},{3,4,5,6}};
		
		for(int i=0; i<a1.length ;i++) {
			for(int j=0; j<a1[i].length;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		
		for(int i=0; i<a2.length ;i++) {
			for(int j=0; j<a2[i].length;j++) {
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for(int i=0; i<a3.length ;i++) {
			for(int j=0; j<a3[i].length;j++) {
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
		
	
}
}
