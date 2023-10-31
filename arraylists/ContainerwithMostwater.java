import java.util.*;
public class ContainerwithMostwater{
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int maxwater=StoredWater(height); //o(n) timecomplexity
        System.out.println("Most water stored:" +maxwater);
    }
    public static int StoredWater(ArrayList<Integer> height1){
        //two pointer approach
        int leftptr=0;
        int rightptr=height1.size()-1;
        int maxwater=0;
        while(leftptr<rightptr){
            int height=Math.min(height1.get(leftptr),height1.get(rightptr));
            int width=rightptr-leftptr;
            int currwater=height*width;
            maxwater=Math.max(maxwater,currwater);
            if(height1.get(leftptr)<height1.get(rightptr)){
                leftptr++;
            }
            else{
                rightptr--;
            }

        }
        return maxwater;
    }
    
}
