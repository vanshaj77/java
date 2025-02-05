public class maxsumsubarray {

    public static void max(int numbers[]){

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currsum = 0;
                for(int k=start;k<=end;k++){
                    currsum += numbers[k];
                }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max subarray sum ="+maxsum);
    }
    public static void main(String[] args) {
        
        int numbers[] = {1,25,5,4,7,8};
        max(numbers);
    }
    
}
