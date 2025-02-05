public class reversestring {

    public static void reverse(String str,int n){
        if(str.charAt(n)==0)
        {
            return;
        }
        System.out.print(str.charAt(n));
        reverse(str, n-1);
    }

    public static void occurrence(String str,String key,int n){
        if(str.charAt(0) == str.charAt(n)){
            System.out.println(n);
        }
        n--;
        occurrence(str, key, n);
    }

    public static void per(String str,String path){

        if(str.length()==0){
            System.out.println(path+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);

            per(ros,path+ch);
        }


    }
    public static void main(String[] args) {
        String  str ="vans";
        // int n = str.length();
        // System.out.println(n);
        // reverse(str,n);
        // String key = "v";
        // occurrence(str,key,n);

        per(str,"");

    }
    
}
