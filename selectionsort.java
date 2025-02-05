public class selectionsort {

    public static void SS(int arr[]){
            for(int i=0;i<arr.length;i++){
                int minpos = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minpos]>arr[j]){
                        minpos = j;
                    }
                }
                int temp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = temp;
            }
        }
        
    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {7,8,9,4,8,7,5,4};
        SS(arr);
        print(arr);
    }
    
}
