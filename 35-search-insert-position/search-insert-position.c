int searchInsert(int* s, int l, int t) {
    for(int i=0;i<l;i++){
        // if(a[i]==t)
        // return i;
        if(s[i]>=t)
        return i;
    }
    return l;
}