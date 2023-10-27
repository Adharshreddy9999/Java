import java.util.*;
public class MergeSort{
    public static void main(String args[]){
        int num[]={4,5,6,1,2,3,7};
        int si=0;
        int ei=num.length-1;
        divide(num,si,ei);
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");
    }
    public static void divide(int num[], int si,int ei){
            if(si>=ei){
                return;
            }
            int mid=si+(ei-si)/2;
            divide(num,si,mid);
            divide(num,mid+1,ei);
            merge(num,si,mid,ei);
    }
    public static void merge(int num[],int si,int mid,int ei ){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(num[i]<num[j]){
                temp[k]=num[i];
                i++;
            }
            else{
                temp[k]=num[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=num[i++];
        }
        while(j<=ei){
            temp[k++]=num[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            num[i]=temp[k];
        }
    }
    
}
