import java.util.*;
public class rainwater {

    public static int trainwater(int water[]){

        int n = water.length;
        int leftMax[] = new int[n];
        leftMax[0] = water[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(water[i],leftMax[i-1]);
        } 
        int RightMax[] = new int[n];
        RightMax[n-1] = water[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(water[i],RightMax[i+1]);
        } 
        int trappedwater = 0;
        for(int j=0;j<n;j++){
            int waterlevel = Math.min(leftMax[j],RightMax[j]);
            trappedwater += waterlevel-water[j];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        
        int water[] = {4,2,0,7,6,5,9};
        int index = trainwater(water);
        System.out.println("trapped water is= "+index+" liter");
    }
    
}
