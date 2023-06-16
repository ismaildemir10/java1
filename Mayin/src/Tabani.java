import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Tabani {
    Scanner inp = new Scanner(System.in);
    Random rand = new Random();
    int row;
    int col;
    boolean game = true;
    String[][] matris1;
    int[][] matris2;
    Tabani(int row,int col){
        this.row=row;
        this.col=col;
        this.matris1 = new String[row][col];
        this.matris2 = new int[row][col];
        for (int i = 0 ; i<row;i++){
            for (int j = 0; j<col;j++){
                matris1[i][j]="-";
                matris2[i][j]=0;
            }
        }
    }
    public void run() {
        int row,col;
        game();
        print(matris1);
        System.out.println("Oyun başladı");
        while (this.game){
            print(matris2);
            System.out.print("Satır sayısı: ");
            row= inp.nextInt();
            System.out.print("Sütün sayısı: ");
            col= inp.nextInt();
            if(!matris1[row][col].equals("*")){
                check(row,col);
            }else {
                this.game =false;
                System.out.println("Oyun bitti");
            }
        }
    }
    public void check(int r,int c){
        if (r >= 0 && r < row && c >= 0 && c < col) {
            String value = "*";
            if (matris1[r][c].equals("-")) {
                if ((c < col - 1) && (matris1[r][c + 1]).equals(value)) {
                    matris2[r][c]++;
                }
                if ((c > 0) && (matris1[r][c - 1]).equals(value)) {
                    matris2[r][c]++;
                }
                if ((r < row - 1) && (matris1[r + 1][c]).equals(value)) {
                    matris2[r][c]++;
                }
                if ((r > 0) && (matris1[r - 1][c]).equals(value)) {
                    matris2[r][c]++;
                }
                if(matris2[r][c]==0){
                    matris2[r][c]=-1;
                }
            }
        } else {
            System.out.println("Invalid row or column value!");
        }
    }
    public  void game(){
        int randRow,randCol,sayac=0;
        while (sayac!=((row*col)/4)){
            randRow = rand.nextInt(this.row);
            randCol = rand.nextInt(this.col);
            String newValue="*";
            if(matris1[randRow][randCol].equals("-")){
                matris1[randRow][randCol]=newValue;
                sayac++;
            }
        }
    }
    public void print(String[][] arr){
        for (int i = 0 ; i<row;i++){
            for (int j = 0; j<col;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public void print(int[][] arr){
        for (int i = 0 ; i<row;i++){
            for (int j = 0; j<col;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}