public class kadanes{

    public static void max(int numbers[]){

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i=0; i<numbers.length;i++){

            cs = cs+numbers[i];
            ms =Math.max(cs,ms);
            if(cs<0){
                cs = 0;
            }
            
        }
    System.out.println("max subarray sum ="+ms);
    }
    public static void main(String[] args){
       
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        max(numbers);
    }
    
}
