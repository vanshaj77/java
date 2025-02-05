package BST;

import Stack.stack_JF;

public class ValidateBST {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean isvalid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);
    }
    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        if(isvalid(root, null, null)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
