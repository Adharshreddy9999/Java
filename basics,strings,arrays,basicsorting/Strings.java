import java.util.*;
public class Strings{
    public static void main(String args[]){
        String str="racecar";
        checkPalindrome(str);
        printSubString(str);
        String str2="hi this is karma";
        System.out.println(upperCase(str2));
        String str3="aaabbcccdd";
        System.out.println(stringCompression(str3));
    }
    public static String stringCompression(String str2){
        String str="";
        for(int i=0;i<str2.length();i++){
            Integer count=1;
            while(i<str2.length()-1 && str2.charAt(i)==str2.charAt(i+1)){
                count++;
                i++;
            }
            str+=str2.charAt(i);
            if(count>1){
                str+=count.toString();
            }
        }
        return str;
    }
    public static String upperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void printSubString(String name){
        int si=2;
        int ei=4;
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr=subStr+name.charAt(i);
        }
        System.out.println(subStr);
    }
    public static boolean checkPalindrome(String name){
        int n=name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i)!=name.charAt(n-i-1)){
                System.out.println("not palindrome");
                return false;
                

            }
        }
        System.out.println("palindrome");
        return true;
         
    }
    
}
