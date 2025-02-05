public class maxsubarraysum2 {
    public static void max(int numbers[]){

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prifix[] = new int[numbers.length];

        prifix[0] = numbers[0];
        for(int i = 1;i<prifix.length;i++){
            prifix[i] = prifix[i-1] + numbers[i];
        }


        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                
                currsum = start==0? prifix[end]:prifix[end]-prifix[start-1];
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
