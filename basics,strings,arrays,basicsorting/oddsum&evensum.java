import java.util.*;
public class second {
    public static void main(String args[]){
        int num;
        int evensum=0;
        int oddsum=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the number");
            num=sc.nextInt();
            if(num%2==0){
                evensum=evensum+num;
            }
            else{
                oddsum=oddsum+num;
            }
            System.out.println("enter the choice 1 for evensum 2 for oddsum");
            int choice=sc.nextInt();

        }while(choice>2);
       switch (choice) {
        case 1:
            System.out.println("even sum="+evensum);
            break;
        case 2:
            System.out.println("odd sum="+oddsum);
            break;
        default:
            System.out.println("wrong choice");
       }
    }
    
}
