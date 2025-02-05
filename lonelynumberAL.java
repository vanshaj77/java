import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lonelynumberAL {

    public static ArrayList<Integer> find(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1<list.get(i+1)){
                list2.add(list.get(i));
            }
        }
        if(list.size() == 1){
            list2.add(list.get(0));
        }
        if(list.size() > 1){
            if(list.get(0)+1 < list.get(1)){
                list2.add(list.get(0));
            }
            if(list.get(list.size()-2)+1 < list.get(list.size()-1)){
                list2.add(list.get(list.size()-1));
            }
        }
        return list2;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(find(list));
    }
}
