import java.util.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            lst.add(nums1[i]);
        }
        for(int i : nums2) {
            lst.add(i);
        }
        Collections.sort(lst);
        //System.out.println(lst);
        for(int i = 0; i < lst.size(); i++) {
            nums1[i] = lst.get(i);
        }
    }

    public static void main(String[] args) {
        merge(new int[]{-1,0,0,3,3,3,0,0,0}, 3, new int[]{1,2,2}, 3);
    }
}
