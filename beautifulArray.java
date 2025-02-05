import java.util.ArrayList;

public class beautifulArray {

    public static ArrayList<Integer> beauty(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer e:ans){
                if(2*e<=n){
                    temp.add(e*2);
                }
            }
            for(Integer e:ans){
                if(2*e-1<=n){
                    temp.add(e*2-1);
                }
            }
            ans = temp;
        }
        return ans;
    }
    
    public static ArrayList<Integer> beautyy(int n){
        ArrayList<Integer> res = new ArrayList<>();
        divideconque(1,1,res,n);
        return res;
    }

    public static void divideconque(int start,int increment,ArrayList<Integer> res,int n){
        if(start+increment>n){
            res.add(start);
            return;
        }

        divideconque(start,2*increment, res, n);
        divideconque(start+increment,2*increment, res, n);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(beautyy(n));
    }
}
