public class binarysearch {

    public static int bs(int number[],int key){
        int start=0;int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={7,8,9,20,21,23};
        System.out.println("index is "+bs(number,21));
    }
    
}
