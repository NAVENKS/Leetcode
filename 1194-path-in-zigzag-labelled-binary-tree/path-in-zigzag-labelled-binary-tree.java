import java.util.*;
class Solution {
    public List<Integer> pathInZigZagTree(int l) {
        List<Integer> list = new ArrayList<>();
        int sl = 1;
        int p = 2;
        while (l >= p) {
            sl++;
            p *= 2;
        }
        System.out.print("sl " + sl);

        while (sl != 0) {
            int val;
            int start = (int) Math.pow(2, sl - 1);
            int end = (start * 2) - 1;
            System.out.println(start + " " + end);

            if (sl % 2 == 0) {
                val = end - (l - start);
                System.out.println("val" + val);
                list.add(l);        
                l = val / 2;        
            } else {
                list.add(l); 
                l = (start + end - l) / 2;
            }
            sl--;
        }

        Collections.reverse(list);
        return list;
    }
}
