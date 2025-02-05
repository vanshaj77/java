public class palindrome {

    public static void main(String[] args) {
        
        int number = 171;
        int b = number;
        int a ;
        int sum = 0;
        while(b>0){
            a = b%10;
            sum = (sum*10)+a;
            b = b/10;
        }
        if(sum == number){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}