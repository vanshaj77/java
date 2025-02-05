import java.util.*;
public class palindrome_LL {

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
    public static int size;

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void addfirst(int data){
        Node newnNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }
    public static void main(String[] args) {
        palindrome_LL ll = new palindrome_LL();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        ll.addfirst(1);
        System.out.println(ll.checkpalindrome());
    }
}
