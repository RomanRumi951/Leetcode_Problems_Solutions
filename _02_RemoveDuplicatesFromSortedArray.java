import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _02_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if((Collections.frequency(lst, nums[i]) < 2))
                lst.add(nums[i]);
        }
        for(int i = 0; i < lst.size(); i++)
        {
            nums[i] = lst.get(i);
        }
        return lst.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3,3,2}));
    }
}
