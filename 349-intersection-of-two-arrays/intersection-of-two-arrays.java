class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i]))
            map.put(nums1[i],1);
        }
        int ans[]=new int[Math.min(nums1.length,nums2.length)];
        int j=0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                ans[j++]=nums2[i];
                map.remove(nums2[i]);
            }
        }
        return Arrays.copyOfRange(ans,0,j);
    }
}