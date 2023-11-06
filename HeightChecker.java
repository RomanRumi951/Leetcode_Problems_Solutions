import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        List<Integer> lst = new ArrayList<>();
        int count = 0;
        for (int i : heights) {
            lst.add(i);
        }
        Collections.sort(lst);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != lst.get(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
