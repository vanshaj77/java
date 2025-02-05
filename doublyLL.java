public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
           this.data = data;
           this.next = null;
           this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newnNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnNode;
            return;
        }
        newnNode.next = head;
        head.prev = newnNode;
        head = newnNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail =  newNode;
    }
    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removelast(){
        if(head == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addlast(4);
        dll.print();
        dll.removelast();
        dll.print();
    }
}
