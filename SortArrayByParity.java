import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        for(int i : nums) {
            if((i % 2) == 0) {
                lst1.add(i);
            }
            else {
                lst2.add(i);
            }
        }
        int[] arr = new int[lst1.size() + lst2.size()];
        for(int i = 0; i < lst1.size(); i++){
            arr[i] = lst1.get(i);
        }
        for(int i = 0, j = lst1.size(); i < lst2.size() ; i++, j++) {
            arr[j] = lst2.get(i);
        }
        lst1.clear();
        lst2.clear();
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(sortArrayByParity(new int[]{3,1,2,4})[3]);
    }
}
