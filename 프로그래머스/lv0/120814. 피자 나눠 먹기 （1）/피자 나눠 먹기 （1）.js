function solution(n) {
    var answer = 0;
    if(n<7)answer=1;
    if(n>=7&&n/7==parseInt(n/7))answer=n/7;
    else if (n>=7&&n/7!=parseInt(n/7)) answer=parseInt(n/7)+1;
    return answer;
}