import java.util.*;
public class Pairsum{
    public static void main(String args[]){
        int target=5;
        ArrayList<Integer> list=new ArrayList<>(); //sorted array
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairsum(list,target));//o(n)


        int target1=16;
        ArrayList<Integer> list2=new ArrayList<>(); //rotated array
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println(pairsumRotatedarray(list2,target1));
        
    }
     public static boolean pairsumRotatedarray(ArrayList<Integer> list3, int target){ //two pointer approach
        int n=list3.size();
        int bp=-1;
        for(int i=0;i<list3.size();i++){
            if(list3.get(i)>list3.get(i+1)){
                bp=i;
                break;
            }
       }
       int leftptr=bp+1;
       int rightptr=bp;

        while(leftptr!=rightptr){
            if(list3.get(leftptr)+list3.get(rightptr)==target){
                return true;
            }
            else if(list3.get(leftptr)+list3.get(rightptr)<target){
                leftptr=(leftptr+1)%n;
            }
            else{
                rightptr=(n+rightptr-1)%n;
            }
        }
        return false;

    }
    

    public static boolean pairsum(ArrayList<Integer> list1, int target){ //two pointer approach
        int leftptr=0;
        int rightptr=list1.size()-1;
        while(leftptr!=rightptr){
            if(list1.get(leftptr)+list1.get(rightptr)==target){
                return true;
            }
            else if(list1.get(leftptr)+list1.get(rightptr)<target){
                leftptr++;
            }
            else{
                rightptr--;
            }
        }
        return false;

    }
    
}
