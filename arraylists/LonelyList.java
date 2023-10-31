//returns list which contains the numbers whose successor and predecessor doesnt exist in the list
import java.util.*;
public class LonelyList{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(); // 10 6 5 8
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        ArrayList<Integer> list1= lonelylist(list);
        System.out.println("Lonely list: "+list1);
    }
    public static ArrayList<Integer> lonelylist(ArrayList<Integer> num){
        ArrayList<Integer> x=new ArrayList<>();
        Collections.sort(num); //5 6 8 10
        int n=num.size();
        for(int i=1;i<n-1;i++){
            if(num.get(i-1)+1<num.get(i)&&num.get(i)+1<num.get(i+1)){
                x.add(num.get(i));

            }
        }
        if(n==1){
            x.add(num.get(0));
        }
        if(n>1){
            if(num.get(0)+1<num.get(1)){
                x.add(num.get(0));
            }
            if(num.get(n-2)+1<num.get(n-1)){
                x.add(num.get(n-1));
            }
        }
        return x;
    }
    
}
