import java.util.ArrayList;
import java.util.List;

public class _02_SortArrayByParity {
    public static int[] sortArrayByParityII(int[] nums) {
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
        for(int i = 0, j = 0; i < arr.length; i += 2, j++){
            arr[i] = lst1.get(j);
        }
        for(int i = 0, j = 1; i < lst2.size() ; i++ , j += 2) {
            arr[j] = lst2.get(i);
        }
        lst1.clear();
        lst2.clear();
        return arr;
    }
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++)
            System.out.println(sortArrayByParityII(new int[]{2,0,3,4,1,3})[i]);
    }
}
