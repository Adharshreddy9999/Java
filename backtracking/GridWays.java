import java.util.*;
public class GridWays{
    public static void main(String args[]){
        int n=3;
        int m=3;
        System.out.println("Total ways: " +gridWays(0,0,n,m));
    }
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){//destination place
            return 1;
        }
        else if(i==n||j==n){//if it exceeds boundary
            return 0;
        }
        int w1=gridWays(i+1,j,n,m);
        int w2=gridWays(i,j+1,n,m);
        return w1+w2;
    }
    
}
