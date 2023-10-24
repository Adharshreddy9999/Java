import java.util.*;
public class duplicateString {
    public static void main(String args[]){
        int idx=0;
        String a="adharshreddy";
        removedupicates(a,idx,new boolean[26],new StringBuilder(""));
    }
    public static void removedupicates(String a,int idx,boolean map[],StringBuilder newstr){
        if(idx==a.length()){
            System.out.println(newstr);
            return;
        }
        char curr= a.charAt(idx);
        if(map[curr-'a']==true){
            removedupicates(a,idx+1,map,newstr);
         }
        else{
            map[curr-'a']=true;
            removedupicates(a,idx+1,map,newstr.append(curr));
        }
    }
    
}
