import java.util.*;
public class binarysearch{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int marks[]=new int[n];
    System.out.println("enter the numbers in array");
    for(int i=0;i<n;i++){
        marks[i]=sc.nextInt();
    }
    System.out.println("enter the key");
    int key=sc.nextInt();
    int index=binarySearch(marks,key);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("index:"+index);
    }  
}
public static int binarySearch(int marks[],int key){
  int start=0;
  int end=marks.length-1;
  int mid=0;
  while(start<=end){
    mid=(start+end)/2;
    if(marks[mid]==key){
        return mid;
    }
    if(marks[mid]>key){
        end=mid-1;
    }
    else{
        start=mid+1;
    }
 }
 return -1;
}
}
