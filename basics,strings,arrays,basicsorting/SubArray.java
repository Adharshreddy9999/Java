import java.util.*;
public class SubArray{
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        printPairs(num);
        printSubarray(num);
        maxSum(num);
    }
    public static void maxSum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currsum=0;
         for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+num[k];
                    System.out.println(+currsum);
                    if(currsum>maxSum){
                        maxSum=currsum;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("maxsum:"+maxSum);
    }
    public static void printSubarray(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(+num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void printPairs(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.println("("+num[i]+ ","+num[j]+ ")");
            }
        }
    }
    
}
