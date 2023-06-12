function solution(n, k) {
    var answer = 0;
    answer=12000*n + 2000*k
    if(n/10>=1)answer-=(2000*parseInt(n/10));
   
    return answer;
}