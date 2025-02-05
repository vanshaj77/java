public class AP_1_ques {

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int sumofarray(int arr[]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void AliceBob(int A[],int B[]){
        int tempA = 0;
        int tempB = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>B[i]){
                tempA+=1;
            }else if(B[i]>A[i]){
                tempB+=1;
            }else if(A[i]==B[i]){
                tempA+=0;
                tempB+=0;
            }
        }
        System.out.println("Alice score ="+tempA+" Bob score ="+tempB);
    }

    public static int display(String arrr[],String n){
        for(int i=0;i<arrr.length;i++){
            if(n == arrr[i]){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void diffofDiagonal(int ar[][]){
        int tmp = 0;
        int tmmp = 0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                    if(i == j){
                        tmp+=ar[i][j];
                    }
                    if((i+j) == (ar.length-1)){
                        tmmp+=ar[i][j];
                    }
            }
        }
        int a = convert_positive(tmp-tmmp);
        System.out.println(a);
    }
    public static int convert_positive(int a){
        if(a<0){
            a = a*-1;
        }
        return a;
    }
    public static int main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //reverse(arr);
        //System.out.println(sumofarray(arr));
        int A[] = {1,3,2};
        int B[] = {2,1,2};
        //AliceBob(A, B);
        String arrr[] = {"vanshaj","kabir","pooja","srishtiii"};
        String n="pooja";
        //System.out.println(display(arrr,n));
        int ar[][] ={{1,2,5},
                     {4,5,6},
                     {7,8,9}};
        diffofDiagonal(ar);

        return 0;
    }
}
