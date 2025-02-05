import java.util.ArrayList;

public class delete {
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

    public int remove(){
        int data = arr.get(0);
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);

        arr.remove(arr.size()-1);

        heapify(0);
        return data;
    }

    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;

        int minidx = i;
        if(left<arr.size() && arr.get(minidx) > arr.get(left)){
            minidx = left;
        }
        if(right < arr.size() && arr.get(minidx) > arr.get(right)){
            minidx = right;
        }
        if(minidx != i){
            int temp = arr.get(i);
            arr.set(i,arr.get(minidx));
            arr.set(minidx,temp);

            heapify(minidx);
        }
    }
    public boolean isEmpty(){
        return arr.size() == 0;
    }

    public static void main(String[] args) {
        delete i = new delete();
        i.add(1);
        i.add(8);
        i.add(5);
        int y = i.remove();
        System.out.println("Minimum element: " + i.peek());
    }
}
