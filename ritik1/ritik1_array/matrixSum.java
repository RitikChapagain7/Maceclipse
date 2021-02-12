package ritik1_array;

public class matrixSum {
	public static void main(String[] args) {
		
		int matA[][]= {{1,2},{3,4}};
		int matB[][]= {{5,6},{7,8}};
		
		int rows =matA.length;
		int columns =matA[0].length;
		
		int sumMat[][] =new int [rows][columns];
		
		//sum calculations
		for(int i=0; i<rows; i++) {
			for (int j=0;j<columns; j++) {
				sumMat[i][j] =matA[i][j]+matB[i][j];
			}
		}
		
		// Display
		System.out.println("SUM of Matrices are :");
		for (int row[]:sumMat) {
			for(int col :row) {
				System.out.println(col+"");
			}
			System.out.println();
		}
	}

}
