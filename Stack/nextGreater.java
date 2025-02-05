package Stack;

import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nG[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nG[i] =  -1;
            }else{
                nG[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nG.length;i++){
            System.out.print(nG[i]+" ");
        }
    }
}
