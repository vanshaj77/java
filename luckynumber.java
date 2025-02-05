public class luckynumber {

    public static int findlucky(int arr[]){

        int ca[] = new int[501];
        for(int i : arr){
            ca[i]++;
        } 
        for(int i=500;i>0;i--){
            if(i == ca[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};
        int a = findlucky(arr);
        System.out.println("greatest lucky number is="+a);
    }
    
}
