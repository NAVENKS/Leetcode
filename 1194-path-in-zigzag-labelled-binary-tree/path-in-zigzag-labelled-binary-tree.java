class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> res= new ArrayList<Integer>();
        res.add(label);
        while(label>1)
        {
            int pow=1;
            while(pow<=label)
                pow=pow*2;
            pow=pow/2;
            System.out.println("Pow:"+pow);
            int nth=label-pow+1;
            int prev_nth=(nth+1)/2;
            System.out.println("nth:"+nth);
            System.out.println("prev_nth:"+prev_nth);
            label=pow-prev_nth;
            System.out.println("label:"+label);
            res.add(label);
            System.out.println("New");
        }
        List<Integer> rev= new ArrayList<Integer>();
        for(int ind=res.size()-1; ind>=0;ind--)
            rev.add(res.get(ind));
        return rev;
    }
}