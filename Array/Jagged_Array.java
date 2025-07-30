import java.util.Scanner;
public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("2D Jagged array: ");
		
		
		
		System.out.print("Enter no. of class_1: ");
		int class_1= sc.nextInt();
		
		System.out.print("Enter no. of class_2: ");
		int class_2= sc.nextInt();
		
		int[][] array= new int[2][];
		array[0] = new int[class_1];
		array[1] = new int[class_2];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print("school "+i+" class "+j+" : ");
				array[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("3D_Jagged Array: ");
		
		System.out.println("Marks of students: ");
		
		//schools
		int[][][] arr = new int[2][][];
		
		//class 
		arr[0] =new int[2][];
		arr[1] =new int[1][];
		
		//mark
		arr[0][0]= new int[2];
		arr[0][1]= new int[1];
		
		arr[1][0]=new int[1];
		
		for(int i=0; i<2; i++) {
			//System.out.println("School "+i+":");
			for(int j=0; j< arr[i].length ;j++) {
				for(int k=0; k< arr[i][j].length ;k++) {
					System.out.print("school "+(i+1)+" class "+(j+1)+" students "+(k+1)+": ");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Marks of the students in a class: ");
		for(int i=0; i<2; i++) {
			System.out.println("School "+(i+1)+":");
			for(int j=0; j< arr[i].length ;j++) {
				System.out.print("Class  "+(j+1)+":");
				for(int k=0; k<arr[i][j].length ;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
