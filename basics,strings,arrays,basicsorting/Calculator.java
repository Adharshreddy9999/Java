import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        char ch;
        System.out.println("enter a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter the operator");
        ch=sc.next().charAt(0);
       /*  if(ch=='+'){
            System.out.println("sum of two numbers:"+(a+b));
        }
        else if(ch=='-'){
            System.out.println("subtraction of two numbers:"+(a-b));
        }
        else{
            System.out.println("division of two numbers:"+(a/b));
        } */
        switch(ch){
            case'+':
                System.out.println(a+b);
                break;
            case'-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("wrong operator");
                break;
            
        }
    }
    
}
