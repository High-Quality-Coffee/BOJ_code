function solution(board) {
    var answer = 0;
    var ary=[];
    for (var i=0;i<board.length+2;i++){
        ary.push([]);
        for(var j=0;j<board.length+2;j++){
            ary[i][j]=0;
        }
    }
    
    for(var i=1;i<board.length+1;i++){
        for(var j=1;j<board.length+1;j++){
            ary[i][j]=board[i-1][j-1];
        }
    }
    
    
    for(var i=1;i<board.length+1;i++){
        for(var j=1;j<board.length+1;j++){
            if(ary[i][j]==1){
                ary[i][j-1]=ary[i][j-1]!=1?-1:1; 
                ary[i][j+1]=ary[i][j+1]!=1?-1:1; 
                ary[i-1][j]=ary[i-1][j]!=1?-1:1; 
                ary[i+1][j]=ary[i+1][j]!=1?-1:1;
                ary[i-1][j-1]=ary[i-1][j-1]!=1?-1:1;
                ary[i-1][j+1]=ary[i-1][j+1]!=1?-1:1;
                ary[i+1][j-1]=ary[i+1][j-1]!=1?-1:1;
                ary[i+1][j+1]=ary[i+1][j+1]!=1?-1:1;
            }
        }
    }
    

    for(var i=1;i<board.length+1;i++)
        for(var j=1;j<board.length+1;j++)
            if(ary[i][j]==0) answer++;
    
    
    return answer;
}