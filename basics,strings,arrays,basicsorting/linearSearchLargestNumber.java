import java.util.*;
public class linearSearchLargestNumber{
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        int key=3;
        int index=linearSearch(num, key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key at index "+index);
        }
        largestNumber(num);
    }
    public static void largestNumber(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("largest number: "+largest);
    }
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    
}
