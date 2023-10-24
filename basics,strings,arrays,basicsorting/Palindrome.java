import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("its a palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
    public static boolean isPalindrome(int n){
        int number=n;
        int rev=0;
        while(number!=0){
            int last_digit=number%10;
            rev=rev*10+last_digit;
            number=number/10;
        }
        if(n==rev){
            return true;
        }
        return false;
    }
}
