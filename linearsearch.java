public class linearsearch {

    public static int search(int marks[], int key){

        for(int i = 0; i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {5,2,6,8,9,1,3};
        int index = search(marks, 3);
        if(index==-1){
            System.out.println("number not availabe");
        }else{
            System.out.println("address at ="+index);
        }

    }
    
}
