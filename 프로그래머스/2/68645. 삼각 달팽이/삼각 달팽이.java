class Solution {
    public int[] solution(int n) {

        int[][] triangle = new int[n][n];
        int x=0,y=0,value=1;
        
        while(true){
            if(n==1){
                int[] one_arr={1};
                return one_arr;
            }
            //아래로 이동
            while(true){
                triangle[x][y]=value;
                if(x+1==n || triangle[x+1][y]!=0) {
                    y=y+1;
                    value++;
                    break;
                }
                x++;
                value++;
            }
            if(triangle[x][y]!=0) break;

            //오른쪽으로 이동
            while(true){
                triangle[x][y]=value;
                if(y+1==n || triangle[x][y+1]!=0){
                    x-=1;
                    y-=1;
                    value++;
                    break;
                }
                y++;
                value++;
            }
            if(triangle[x][y]!=0) break;
            
            //왼쪽 위로 이동
            while(true){
                triangle[x][y]=value;

                if(triangle[x-1][y-1]!=0){
                    x+=1;
                    value++;
                    break;
                }
                x-=1;
                y-=1;
                value++;
            }
            if(triangle[x][y]!=0) break;
        }
        
        int[] answer = new int[value-1];
        int idx=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                answer[idx++]=triangle[i][j];
            }
        }
        
        
        return answer;
    }
}