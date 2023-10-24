import java.util.*;
public class spiralMatrix{
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
    public static void printSpiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]+" ");
            }
            //right
            for(int j=startrow+1;j<=endrow;j++){
                System.out.print(matrix[j][endcol]+" ");
            }
            //down
            for(int k=endcol-1;k>=startcol;k--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][k]+" ");
            }
            //left
            for(int l=endrow-1;l>=startrow;l--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[l][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }

    
}
