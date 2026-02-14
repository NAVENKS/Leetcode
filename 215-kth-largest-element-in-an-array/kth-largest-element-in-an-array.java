class Solution {
    public int findKthLargest(int[] n, int k) {
        Arrays.sort(n);
        return n[n.length-k];
    }
}