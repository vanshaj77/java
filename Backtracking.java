public class Backtracking {

    public static void changearr(int arr[],int i,int val){
        if(i == arr.length){
            Printarr(arr);
            return;
        }

        arr[i] = val;
        changearr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void Printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void findsubset(String str, int i,String ans){

        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        findsubset(str, i+1, ans+str.charAt(i));
        findsubset(str, i+1, ans);
    }

    public static void findperm(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            findperm(newstr, ans+curr);
        }
    }

    public static int gridways(int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1){
            return 1;
        } 
        else if( i==n || j==m){
                return 0;
            }
            int w1 = gridways(i+1, j, n, m);
            int w2 = gridways(i, j+1, n, m);
            return w1+w2;
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changearr(arr,0,1);
        // Printarr(arr);
        String str = "abc";
        // findsubset(str, 0," ");
        // findperm(str, " ");
        int n=3,m=3;
        System.out.println(gridways(0, 0, n, m));
    }
}
