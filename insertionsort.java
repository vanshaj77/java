public class insertionsort {

    public static void IS(int reee[]){

        for(int i=1;i<reee.length;i++){
            int curr = reee[i];
            int prev = i-1;

            while(prev>=0 && reee[prev]>curr){
                reee[prev+1] = reee[prev];
                prev--;
            }
            reee[prev+1] = curr;
        }
    }
    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int reee[] = {9,8,4,5,6,1,2};
        IS(reee);
        print(reee);
    }
    
}
