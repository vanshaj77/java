import java.util.LinkedList;

public class linkedlist {
    
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

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=null;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // public void addmid(int idx,int data){
    //     if(idx == 0){
    //         addfirst(data);
    //         return;
    //     }
    //     Node newNode = new Node(data);
    //     size++;
    //     Node temp = head;
    //     int i=0;
    //     while (i<idx-2) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     newNode.next = temp.next;
    //     temp.next = newNode;
    // }

    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    // public void reverse(){
    //     Node prev = null;
    //     Node curr = tail = head;
    //     Node next;
    //     while(curr!=null){
    //         next = curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //     }
    //     head = prev;
    // }

    // public void deleteNthfromEnd(int n){
    //     int sz = 0;
    //     Node temp = head;
    //     while(temp!=null){
    //         temp = temp.next;
    //         sz++;
    //     }
    //     if(n==sz){
    //         head=head.next;
    //         return;
    //     }
    //     int i=1;
    //     int iTofind = sz-n;
    //     Node prev = head;
    //     while(i<iTofind){
    //         prev = prev.next;
    //         i++;
    //     }
    //     prev.next = prev.next.next;
    //     return;
    // }

    // public int itrSearch(int key){
    //     Node temp = head;
    //     int i=0;
    //     while(temp!=null){
    //         if(temp.data == key){
    //             return i;
    //         }
    //         temp = temp.next;
    //         i++;
    //     }
    //     return -1;
    // }

    // public int helper(Node head,int key){
    //     if(head==null){
    //         return -1;
    //     }
    //     if(head.data == key){
    //         return 0;
    //     }
    //     int idx = helper(head.next, key);
    //     if(idx == -1){
    //         return -1;
    //     }
    //     return idx+1;
    // }
    // public int recursiveSearch(int key){
    //     return helper(head, key);
    // }

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
        linkedlist ll = new linkedlist();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        ll.removefirst();
        ll.removelast();
        ll.print();
    }
}
