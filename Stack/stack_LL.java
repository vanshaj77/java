package Stack;

public class stack_LL {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head = null;

    public static boolean isEmpty(){
        return head == null;
    }

    public static void push(int data){
        node newNode = new node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    public static void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        stack_LL ll = new stack_LL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.print();
        System.out.println("");
        ll.pop();
        while(!isEmpty()){
            System.out.print(ll.peek()+" ");
            ll.pop();
        }
    }
}
