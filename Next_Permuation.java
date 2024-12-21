import java.util.*;

public class Next_Permuation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer>ans= solution(A);
        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
    public static List<Integer> solution(List<Integer>ans){
        int n= ans.size();
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(ans.get(i)<ans.get(i+1)){
                index=i;
                break;
            }
        }
        if(index==-1){
            Collections.reverse(ans);
            return ans;
        }
        for(int i=n-1;i<index;i--){
            if(ans.get(i)>ans.get(index)){
                int t= ans.get(index);
                ans.set(i, ans.get(index));
                ans.set(index, t);
                break;
            }
            
        }
        List<Integer> sublist = ans.subList(index + 1, n);
        Collections.reverse(sublist);

        return ans;
    }
}