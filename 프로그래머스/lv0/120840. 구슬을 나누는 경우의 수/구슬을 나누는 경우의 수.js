// function solution(balls, share) {
//     var answer = 0;
//     var i,j;
    
//     function b(n,k){
//         if(k==0||n==k)return 1;
//         else 
//             return b(n-1,k-1)+b(n-1,k);
//     }
    
//     return b(balls,share);
// }

function solution(balls, share) {
    var answer = 0;
    var arr = new Array(balls+1).fill(0).map(() => new Array(share+1));
    
    for(var i=0;i<=balls;i++){
        for(var j=0;j<=Math.min(i,share);j++){
            if(j==0 || i==j) arr[i][j]=1;
            else arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }
    }
    return arr[balls][share];
}
