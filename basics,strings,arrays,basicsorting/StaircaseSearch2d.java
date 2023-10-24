import java.util.*;
public class StaircaseSearch2d{
    public static void main(String args[]){
        int num[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        StaircaseSearch2d(num,key);
    }
    public static boolean StaircaseSearch2d(int num[][],int key){
        int row=0;
        int col=num[0].length-1;
        while(row<num.length&&col>=0){
            if(num[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<num[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    
}
