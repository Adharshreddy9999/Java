import java.util.*;
public class primeInRange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        inRange(n);

    }
    public static void inRange(int n){
        for(int i=2;i<n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isprime(int n){
         boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    
}
