function solution(common) {
    var answer = 0;
    
    var leng=common.length;
    
    if(common[1]*2==common[0]+common[2])
        answer=common[leng-1]*2 - common[leng-2];
    
    else if(Math.pow(common[1],2)==common[0]*common[2])
        answer=Math.pow(common[leng-1],2)/common[leng-2];
    
    return answer;
}