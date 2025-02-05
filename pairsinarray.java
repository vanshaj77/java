public class pairsinarray {

    public static void pairs(int number[]){

        for(int i=0;i<number.length;i++)
        {
            int a = number[i];
            for(int j=i+1;j<number.length;j++)
            {
                System.out.print("("+a+","+number[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[]={0,1,2,3,4,6};
        pairs(number);
    }
    
}
