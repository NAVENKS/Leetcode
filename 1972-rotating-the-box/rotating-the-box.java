class Solution {
    public char[][] rotateTheBox(char[][] b) {
        int c=b[0].length,r=b.length;
        char arr[][]=new char[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[j][r-i-1]=b[i][j];
            }
        }
        c=arr[0].length;
        r=arr.length;
        for(int j=c-1;j>=0;j--){
            Queue<Integer>space=new LinkedList<>();
            for(int i=r-1;i>=0;i--){
                if(arr[i][j]=='*')
                space=new LinkedList<>();
                else if(arr[i][j]=='.')
                space.offer(i);
                else{
                    if(!space.isEmpty()){
                        arr[space.poll()][j]='#';
                        arr[i][j]='.';
                        space.offer(i);
                    }
                }
            }
        }
        return arr;
    }
}