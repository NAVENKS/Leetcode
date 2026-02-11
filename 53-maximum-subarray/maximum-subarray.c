int maxSubArray(int* n, int s) {
    int max=-10000000;
    int sum=0;
        for(int i=0;i<s;i++){
            sum=sum+n[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0)
            sum=0;
        }
        return max;
}