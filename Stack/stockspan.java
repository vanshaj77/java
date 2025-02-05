package Stack;

import java.util.Stack;

public class stockspan {

    public static void Stokspan(int arr[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            int currPrice = arr[i];
            while (!s.isEmpty() && currPrice > arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevhigh = s.peek();
                span[i]= i - prevhigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,85,100};
        int span[] = new int[arr.length];
        Stokspan(arr,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
