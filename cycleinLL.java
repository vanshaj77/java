public class cycleinLL {
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

    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if ( cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = head.next;
        System.out.println(iscycle());
        removeCycle();
        System.out.println(iscycle());
    }
}
