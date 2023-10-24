public class hallowRectangle{
    public static void main(String args[]){
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(i==3||i==0||j==0||j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}
