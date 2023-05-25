function solution(n) {
    var answer = 0;
    var result=1;
    for(i=1;i<=n;i++){
        result=result*i;
        if(result<=n){
            answer=i;
        }
    }
    
    return answer;
}