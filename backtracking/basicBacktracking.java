import java.util.*;
public class basicBacktracking{
    public static void main(String args[]){
        int arr[]=new int[5];
        backtrackArray(arr,0,1);
        System.out.println();
        System.out.print("Array after backtracking: ");
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void backtrackArray(int arr[],int i,int val){
       if(i==arr.length){
        System.out.print("Array before backtracking: ");
        printArray(arr);
        return;
       }
        arr[i]=val;
        backtrackArray(arr,i+1,val+1);
        arr[i]=val-2;
    }
    
}
