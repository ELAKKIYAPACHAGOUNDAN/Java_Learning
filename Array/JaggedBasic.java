
public class JaggedBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2D_Jagged Static: ");
		//row constant
		int[][] array= new int[][] {{10,20,30,40},{50,60,70,80,90,100},{110,120,130,}};
		
		//column 
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
	    System.out.println();
	    System.out.println();
	    System.out.println("3D_Jagged Static: ");
	    
	    int[][][] a= new int[][][] {
	    	{{10,2,30},{20,3,4,5,6}},
	    	{{1,234,3,2}}
	    	};
	    
		for(int i=0; i<2; i++) {
			System.out.println("Block: "+(i+1));
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length ;k++) {
					System.out.print(a[i][j][k]+" ");
				}
			    System.out.println();
			}
		    System.out.println();

		}
	}

}
