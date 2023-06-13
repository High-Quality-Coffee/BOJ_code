function solution(n) {
    var answer = 0;
    for(var i=n;i>=0;i--){
        if(i%2==0)answer+=i;
    }
    return answer;
}