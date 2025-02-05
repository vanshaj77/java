public class stockmarket {

    public static int maxp(int prices[]){

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){

            if(buyprice<prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        
        int prices[] = {7,1,2,5,6,9};
        int value = maxp(prices);
        System.out.println("maxprofit ="+ value);
    }
    
}
