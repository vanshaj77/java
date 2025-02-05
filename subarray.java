public class subarray {

    public static void subway(int number[]){

        for(int i=0;i<number.length;i++){
            int start = i;

            for(int j=i;j<number.length;j++){
                int end = j;

                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
            System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1,25,5,4,7,8};
        subway(number);
    }
    
}
