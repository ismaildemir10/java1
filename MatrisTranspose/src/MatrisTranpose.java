public class MatrisTranpose {
    public static void main(String[] args) {
        int[][] arr ={
                {2,3,4},
                {5,6,4}
        };
        int rows=2;
        int cols=3;
        int[][] arrTranspose=new int[cols][rows];
        for (int i=0; i< rows;i++){
            for (int j=0;j<cols;j++){
                arrTranspose[j][i]=arr[i][j];
            }
        }
        for (int i = 0; i<cols;i++){
            for(int j =0;j<rows;j++){
                System.out.print(arrTranspose[i][j] + " ");
            }
            System.out.println();
        }
    }
}