import java.util.*;
public class arraylistt {
    public static void swap(ArrayList<Integer> list,int idex1,int idex2){
        int temp = list.get(idex1);
        list.set(idex1,list.get(idex2));
        list.set(idex2,temp);
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        
        System.out.println(mainlist);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
        }

        // int idex1 = 1,idex2 = 3;
        // Collections.sort(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
        // swap(list,idex1,idex2);
        // System.out.println(list);



    }
}

