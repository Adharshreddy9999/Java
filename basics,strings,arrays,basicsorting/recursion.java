import java.util.*;
public class recursion{
    public static void main(String args[]){
        /*  int num[]={3,2,4,5,6,2,7};
        int key;
        int index;
        occ(num,2,0);*/
        //String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        //int num=1940;
       //NumbertoString(s,num); 
       int n=10;
       decreasingOrder(n);
    }
    public static void NumbertoString(String s[],int num){
        if(num==0){
            return;
        }
        int lastdigit=num%10;
        NumbertoString(s, num/10);
        System.out.print(s[lastdigit]+" ");
    }
    public static void occ(int num[],int key,int index){
        if(index==num.length){
            return;
        }
        if(num[index]==key){
            System.out.print(index+" ");
        }
        occ(num,key,index+1);
    }
    public static void decreasingOrder(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasingOrder(n-1);
    }
}
