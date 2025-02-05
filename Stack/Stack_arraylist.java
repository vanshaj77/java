package Stack;

import java.util.ArrayList;

public class Stack_arraylist {

    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }

    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int Top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return Top;
    }

    public static void push(int data){
        list.add(data);
    }

    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        Stack_arraylist s = new Stack_arraylist();
        push(1);
        s.push(2);
        s.push(3);

        while (!isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
