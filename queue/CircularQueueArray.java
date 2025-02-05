package queue;

public class CircularQueueArray {
    static class CQ{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CQ(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isfull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CQ s = new CQ(5);
        s.add(1);
        s.add(2);
        s.add(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}
