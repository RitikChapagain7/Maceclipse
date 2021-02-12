package ritik1_array;

public class matrixaMultiply {
	public static void main(String[] args) {
		int matA[][]= {{1,2,3},{4,5,6}};
		int matB[][]= {{7,8},{9,10},{11,12}};
		
		int rows =matA.length;
		int columns=matB[0].length;
		
		int comIndex =matB.length;
		
		int mulMat[][]=new int [rows][columns];
		
		// calculation
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				   mulMat[i][j]=0;
				 for(int k=0; k<comIndex;k++) {
				 mulMat[i][j] +=matA[i][k]*matB[k][j];
				 }
				
				
			}
		}
		
		System.out.println("Matric multiplication Result");
		for (int row[]: mulMat) {
			for (int col:row) {
				System.out.println(col +"");
			}
			System.out.println();
		}
	}

}
