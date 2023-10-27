import java.util.*;
public class SubSetsandPermutations{
    public static void main(String args[]){
        String s="abc";
        String ans="";
        int i=0;
        System.out.println("Printing substrings:");
        Subsets(s,ans,i);
        System.out.println("Printing permutations:");
        Permutations(s,ans);

    }
    public static void Permutations(String s,String ans){
       if(s.length()==0){
        System.out.println(ans);
        return;
       }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
             String newstr=s.substring(0,i)+s.substring(i+1);
            Permutations(newstr,ans+curr);
        }
    }
    public static void Subsets(String s,String ans,int i){
        if(i==s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;
        }
        Subsets(s,ans+s.charAt(i),i+1);
        Subsets(s,ans,i+1);
    }
    
}
