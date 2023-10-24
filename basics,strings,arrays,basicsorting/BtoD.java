import java.util.*;
public class BtoD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        int n=sc.nextInt();
        int pow=0;
        int decno=0;
        while(n>0){
           int last=n%10;
            decno=decno+(last*(int)Math.pow(2,pow));
            n=n/10;
            pow++;

        }
        System.out.println(decno);
    }
    
}
