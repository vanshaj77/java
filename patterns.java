public class patterns {

    public static void main(String[] args) {
        int n = 9;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==j||(i+j)==8)
                System.out.print("v");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}