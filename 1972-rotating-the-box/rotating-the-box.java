class Solution {
    public char [][] reverse(char [][]arr){
        int c=arr[0].length,r=arr.length;
        for(int j=0;j<r;j++){
        int s=0,e=c-1;
        while(s<e){
            char ch=arr[j][s];
            arr[j][s]=arr[j][e];
            arr[j][e]=ch;
            s++;
            e--;
        }
        }
        return arr;
    }
    public char[][] rotateTheBox(char[][] b) {
        int c=b[0].length,r=b.length;
        char arr[][]=new char[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[j][i]=b[i][j];
            }
        }
        c=arr[0].length;
        r=arr.length;
        arr=reverse(arr);
        for(int j=c-1;j>=0;j--){
            Queue<Integer>space=new LinkedList<>();
            for(int i=r-1;i>=0;i--){
                if(arr[i][j]=='*')
                space.clear();
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