import java.util.*;
public class TwoDArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int row=sc.nextInt();
        int col= sc.nextInt();

        int[][] arr1= new int[row][col];    //2D Array with row,col size.

        // int x=10;  //Element to be find.

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        int x= sc.nextInt();   //Element to be find.

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(x==arr1[i][j]){
                    System.out.println("(" + i +", "+ j + ")");
                }
            }
        }



        // //Input
        // for(int i=0; i<row; i++ ){
        //     for(int j=0; j<col; j++){
        //         arr1[i][j]= sc.nextInt();
        //     }
        // }

        // System.out.println("Output: ");
        // System.out.println();

        // //Output
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}

