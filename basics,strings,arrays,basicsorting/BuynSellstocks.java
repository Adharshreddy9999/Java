import java.util.*;
public class BuynSellstocks{
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        maxProfit(prices);

    }
    public static void maxProfit(int prices[]){
       int  buy_price=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){
                int profit=prices[i]-buy_price;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buy_price=prices[i];
            }
       }
       System.out.println("maximum profit:"+maxProfit);

    }
    
}
