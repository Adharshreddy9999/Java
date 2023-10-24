import java.util.*;
public class basic4Sorting{
    public static void main(String args[]){
        int num[]={3,4,5,2,1};
        int num1[]={3,4,2,1,3,4,1,1};
        bubbleSort(num);
        printArray(num);
        System.out.println();
        selectionSort(num);
        printArray(num);
        System.out.println();
        insertionSort(num);
        printArray(num);
        System.out.println();
        Arrays.sort(num);
        printArray(num);
        System.out.println();
        countingSort(num1);
        printArray(num1);
        
    }
    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void countingSort(int num[]){
        int largest_number=Integer.MIN_VALUE;
        int n=num.length;
        for(int i=0;i<n;i++){
            largest_number=Math.max(largest_number,num[i]);
        }
        int count[]=new int[largest_number+1];
        for(int i=0;i<n;i++){
            count[num[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void insertionSort(int num[]){
        for(int i=1;i<num.length;i++){
            int prev=i-1;
            int curr=i;
            while(prev>=0&&num[prev]>num[curr]){
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=num[curr];
        }
    }
    public static void selectionSort(int num[]){
        for(int i=0;i<num.length-1;i++){
           int minpos=i;
            for(int j=i+1;j<num.length-1;j++){
                if(num[minpos]>num[j]){
                    minpos=j;
                }
            }
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;
        }
    }
    public static void bubbleSort(int num[]){
       int n=num.length;
        for(int turns=0;turns<n-1;turns++){
            for(int j=0;j<n-1-turns;j++){
                if(num[j]>num[j+1]){
                    //swap
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
}
