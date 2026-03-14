class Solution {
    public int[] twoSum(int[] arr, int t) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(t-arr[i]))return new int[]{i,map.get(t-arr[i])};
            map.put(arr[i],i);
        }
        return new int[2];
    }
}