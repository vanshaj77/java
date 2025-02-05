public class recursion {
    
    public static void decorder(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        decorder(n-1);
    } 

    public static void incorder(int m){
        if(m == 1){
            System.out.print(m +" ");
            return;
        }
        incorder(m-1);
        System.out.print(m + " ");
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int f = n * factorial(n-1);
        return f;
    }

    public static int calsum(int m){
        if (m == 1) {
            return 1;
        }
        int f = m + calsum(m-1);
        return f;
    }

    public static int fibo(int n){

        if( n == 0 || n == 1){
            return n;
        }
        int f = fibo(n-1) + fibo(n-2);
        return f;
    }

    public static boolean issorted(int[] arr,int i){

        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, ++i);
    } public static int firstOccurence(int arr[], int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    public static int lastoccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        int found = lastoccurence(arr, key, i+1);
        if(found == -1 && arr[i] == key){
            return i;
        }
        return found;
    }

    public static int power(int a,int n){
        
        if (n == 0) {
            return 1;
        }

        int hp = power(a, n/2);
        int hpSQ = hp * hp;

        if (n%2 != 0) {
            return a*hpSQ;
        }
        return hpSQ;
    }

    public static int tilingproblem(int n){

        if(n == 0||n ==1){
            return 1;
        }
        return tilingproblem(n-1) + tilingproblem(n-2);
    }

    public static void removeduplicate(String str,int idx,StringBuilder newstr,boolean map[]){

        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            removeduplicate(str, idx+1, newstr, map);
        }else{
            map[currchar - 'a'] = true;
            removeduplicate(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static int friendpairing(int n){

        if(n == 1||n == 2){
            return n;
        }
        return friendpairing(n-1) + (n-1)*factorial(n-2);
    }

    public static void printBinString(int n,int lastplace,String str){
        
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0, str+'0');

        //without consecutive 1's
        if(lastplace == 0){
            printBinString(n-1, 1, str+'1');
        }
        //with cosecutive 1's
        // printBinString(n-1, 1, str+'1');
    }
    public static void main(String[] args) {
        //int arr[] = {1,5,4,3,2,6,9,2,7};
        //printBinString(3, 0, " ");
        System.out.println(power(2, 2));
    }
}
