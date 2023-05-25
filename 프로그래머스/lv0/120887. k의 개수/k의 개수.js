function solution(i, j, k) {
    var answer = 0;
    
    k=k.toString();
    
    for(var a=i;a<=j;a++){
        answer+=(a.toString().split(k).length-1);
    }
    return answer;
}