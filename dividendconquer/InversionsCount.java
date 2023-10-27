import java.util.*;
public class InversionsCount{
    public static void main(String args[]){
        int num[]={1,20,6,4,5};
        int si=0;
        int ei=num.length-1;
        int x=divide(num,si,ei);
        System.out.println("Number of inversions: "+x);
    }
    public static int divide(int num[], int si,int ei){
        int inversion_count=0;
            if(si<ei){
            int mid=si+(ei-si)/2;
            inversion_count= divide(num,si,mid)+divide(num,mid+1,ei);
            inversion_count+=merge(num,si,mid+1,ei);
            }
            return inversion_count;
    }
    public static int merge(int num[],int si,int mid,int ei ){
        int i=si;
        int j=mid;
        int k=0;
        int inv_count=0;
        int temp[]=new int[ei-si+1];
        while(i<mid && j<=ei){
            if(num[i]<=num[j]){
                temp[k]=num[i];
                i++;
            }
            else{
                temp[k]=num[j];
                inv_count+=(mid-i);
                j++;
            }
            k++;
        }
        while(i<mid){
            temp[k++]=num[i++];
        }
        while(j<=ei){
            temp[k++]=num[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            num[i]=temp[k];
        }
        return inv_count;
    }
    
}
