import java.util.*;
public class MajorityElementRecursion{
    public static void main(String args[]){
        int num[]={2,2,1,1,1,2,2};
        int x=Majority(num,0,num.length-1);
        System.out.println("Majority element:"+x);
    }
    public static int Majority(int num[],int si,int ei){
        if(si>=ei){
            return num[si];
        }
        int mid=(si+ei)/2;
       int left=Majority(num,si,mid);
       int right= Majority(num,mid+1,ei);
       if(left==right){
        return left;
       }
       int leftcount=CountInrange(num,left,si,ei);
       int rightcount=CountInrange(num,right,si,ei);

       return leftcount>rightcount?left:right;
    }
    public static int CountInrange(int num[],int key,int si,int ei){
        int count=0;
        for(int i=si;i<ei;i++){
            if(num[i]==key){
                count++;
            }
        }
        return count;
    }
    
}
