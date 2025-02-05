import java.util.ArrayList;

public class Insert {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
    public static void main(String[] args) {
        Insert i = new Insert();
        i.add(1);
        i.add(8);
        i.add(5);
        System.out.println("Minimum element: " + i.peek());
    }
}
