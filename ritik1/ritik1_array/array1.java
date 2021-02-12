package ritik1_array;

public class array1 {
	public static void main(String[] args) {
		
		
		int matA[][] =  { {1,2,3} , {4,5,6} };

        
        int rows = matA.length;

        int colums= matA[0].length;

        

        

        // for loop 

        

        for(int i=0; i<rows;i++) {

            for(int j=0; j<colums; j++) {

                

                System.out.print(matA[i][j] + " ");    

            }// end loop j    

        System.out.println();

        }// end loop i

        

        System.out.println(".....................");

        // for each to day

        

        for(int row[] :matA) {

            for(int col : row) {

                System.out.print(col + " ");

            }

            System.out.println();

        }    


        

	}

}
