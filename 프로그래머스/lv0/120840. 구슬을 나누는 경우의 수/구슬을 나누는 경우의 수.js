function solution(balls, share) {
    var answer = 0;
    var i,j;
    
    function b(n,k){
        if(k==0||n==k)return 1;
        else 
            return b(n-1,k-1)+b(n-1,k);
    }
    
    return b(balls,share);
}