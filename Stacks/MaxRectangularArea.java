import java.util.*;
public class MaxRectangularArea {
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        MaxArea(arr);
    }
    public static void MaxArea(int arr[]){
        int MaxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=arr.length;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //Area
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            MaxArea=Math.max(currArea,MaxArea);
        }
        System.out.println("max area in histogram = "+MaxArea);
    }
    
}
