import java.util.*;
public class changeCase {
    public static void main(String args[]){
        String a="konala surya adharsh reddy";
        System.out.println(toggle(a));
    }
    public static String toggle(String a){
        StringBuilder sb= new StringBuilder("");
        sb.append(Character.toUpperCase(a.charAt(0)));
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ' && i<a.length()-1){
                sb.append(a.charAt(i));
                i++;
                sb.append(Character.toUpperCase(a.charAt(i)));
            }
            else{
                sb.append(a.charAt(i));
            }
        }
        return sb.toString;
    }
    
}
