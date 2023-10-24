import java.util.*;
public class largestinArray {
    public static int largest(int number[] ,int key){
       int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int number[]={2,4,5,10,100};
        int key=10;
        int x=largest(number,key);
        System.out.println("largest number:"+x);

    }
    
}
