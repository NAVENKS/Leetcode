class Solution {
    boolean isPrime(int input)
    {
        if(input==2||input==3)return true;
        if(input%2==0||input==1) return false;
        int cf;
        for(cf=3; cf*cf<=input; cf+=2)
            if(input%cf==0) return false;
        return true;
    }
    void mainfun(int m[][],int r,int c,HashMap<Integer,Integer>map){
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1},{-1,-1},{1,1},{-1,1},{1,-1}};
        int tr=m.length;
        int tc=m[r].length;
        int cal_row,cal_col;
        int num;
        int dir_ind;
        for(dir_ind=0;dir_ind<dir.length;dir_ind++)
        {
            cal_row=r;
            cal_col=c;
            num=0;
            while(cal_row>=0&&cal_row<tr&&cal_col>=0&&cal_col<tc)
            {
                num=num*10+m[cal_row][cal_col];
                if(num>10&&isPrime(num)==true)
                    map.put(num,map.getOrDefault(num,0)+1);
                cal_row+=dir[dir_ind][0];
                cal_col+=dir[dir_ind][1];
            }
        }
    }
    public int mostFrequentPrime(int[][] mat) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mainfun(mat,i,j,map);
            }
        }
        int max_occur=0;
        int max_rep_prime=-1;
        for(int key:map.keySet())
        {
            if(map.get(key) > max_occur)
            {
                max_occur=map.get(key);
                max_rep_prime=key;
            }
            else if(map.get(key) == max_occur&&key>max_rep_prime)
            {
                max_rep_prime=key;
            }
            
        }
        return max_rep_prime;

    }
}