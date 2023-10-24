import java.util.*;
public class DtoB {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int binary=0;
        int power=0;
        int lastdigit;
        while(n>0){
            lastdigit=n%2;
            binary=binary+(int)(Math.pow(10,power))*lastdigit;
            n=n/2;
            power++;
        }
        System.out.println(binary);
        
    }
    
}
