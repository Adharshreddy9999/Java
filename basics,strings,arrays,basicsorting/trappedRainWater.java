import java.util.*;
public class trappedRainWater{
    public static void main(String args[]){
        int bar_level[]={4,2,0,6,3,2,5};
        water(bar_level);


    }
    public static void water(int bar_level[]){
        int n=bar_level.length;
        //left max array
        int left_max[]=new int[n];
        left_max[0]=bar_level[0];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(bar_level[i],left_max[i-1]);
        }

        //right max array
        int right_max[]=new int[n];
        right_max[n-1]=bar_level[n-1];
        for(int j=n-2;j>=0;j--){
            right_max[j]=Math.max(bar_level[j],right_max[j+1]);
        }
        //loop
        int trapped_water=0;
        for(int i=0;i<n;i++){
            int water_level=Math.min(left_max[i],right_max[i]);
            trapped_water+=water_level-bar_level[i];
        }
        System.out.println("total trapped rain water:"+trapped_water);
    }
}
