import java.util.*;
public class ArrayListBasics{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0); //adding numbers
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Number at 1st index: "+list.get(1)); //number indexing
        list.remove(4); //removing number at that index
        list.set(2,5); //changing value at that index
        System.out.println(list.contains(6));
        System.out.println("Printing arraylist: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(0); 
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        int idx1=2;
        int idx2=4;
        System.out.println("before swapping: ");
        System.out.println(list1);
        Swap(list1,idx1,idx2);
        System.out.println("after swapping: ");
        System.out.println(list1);

    }
    public static void Swap(ArrayList<Integer> list1,int idx1,int idx2){
        int temp=list1.get(idx1);
        list1.set(idx1,list1.get(idx2));
        list1.set(idx2,temp);
    }
    
}
