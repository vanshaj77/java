import java.util.*;
public class largestno {

    public static int largest(int number[]){
        int j = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(j<number[i])
            {
                j=number[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {

        int number[] = {1,4,5,6,8,7,9};
        int no = largest(number);
        System.out.println("largest no. is="+no);      
    }
    
}
