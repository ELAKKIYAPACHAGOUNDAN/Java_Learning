import java.util.*;
public class Array_1D_2D_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("One Dimensional array: ");
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int[] array= new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Array ["+i+"] -> : ");
			array[i]=sc.nextInt();
		}
		//System.out.println();
		for(int i=0; i<n; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println();

		System.out.println("Two Dimensional array: ");
		System.out.print("enter rows: ");
		int row= sc.nextInt();
		System.out.print("enter columns: ");
		int column = sc.nextInt();
		int[][] arrays= new int[row][column];
		for(int i=0; i<row; i++) {
			for(int j=0; j<column ;j++) {
			System.out.print("Array ["+i+"]["+j+"] -> : ");
			arrays[i][j]=sc.nextInt();
		}
	}
		System.out.println();
		for(int i=0; i<row; i++) {
			for(int j=0; j<column ;j++) {
			System.out.print(arrays[i][j]+" ");
		}
			System.out.println();
		}
		System.out.println("Three Dimensional array: ");
		System.out.print("enter block: ");
		int block = sc.nextInt();
		System.out.print("enter rows: ");
		int rows= sc.nextInt();
		System.out.print("enter columns: ");
		int columns = sc.nextInt();
		int[][][] arr= new int[block][rows][columns];
	
		for(int i=0; i<block; i++) {
			for(int j=0; j<rows ;j++) {
				for(int k=0; k<columns ;k++) {
			System.out.print("Array ["+i+"]["+j+"]["+k+"] -> : ");
			arr[i][j][k]=sc.nextInt();
				}}
			
	}
		System.out.println();
		for(int i=0; i<block; i++) {
			for(int j=0; j<rows ;j++) {
				for(int k=0; k<columns ;k++) {
			System.out.print(arr[i][j][k]+" ");
		}
			System.out.println();
		}
			System.out.println();

		}
	sc.close();
	}

}
