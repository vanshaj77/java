public class ZigzagLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnNode = new Node(data);
        if(head == null){
            head = tail = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }

    public void zigzag(){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ZigzagLL ll = new ZigzagLL();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
