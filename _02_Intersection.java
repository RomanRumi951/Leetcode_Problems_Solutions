import java.util.*;

public class _02_Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        List<Integer> lst3 = new ArrayList<>();
        for (int a : nums1) {
            lst1.add(a);
        }
        for (int a : nums2) {
            lst2.add(a);
        }
        if(lst1.size() > lst2.size())
        {
            for(int i = 0; i < lst1.size(); i++)
            {
                if(lst2.contains(lst1.get(i))) {
                    lst3.add(lst1.get(i));
                    lst2.remove(lst1.get(i));
                }
            }
            lst1.clear();
            lst2.clear();
        }
        else
        {
            for(int i = 0; i < lst2.size(); i++)
            {
                if(lst1.contains(lst2.get(i))) {
                    lst3.add(lst2.get(i));
                    lst1.remove(lst2.get(i));
                }
            }
            lst1.clear();
            lst2.clear();
        }
        System.out.println(lst3);
        int[] nums3 = new int[lst3.size()];
        for(int i = 0; i < lst3.size(); i++) {
            nums3[i] = lst3.get(i);
        }
        lst3.clear();
        return nums3;
    }

    public static void main(String[] args) {
        System.out.println(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})[0]);
    }
}
