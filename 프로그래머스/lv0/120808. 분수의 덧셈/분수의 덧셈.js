function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    
    function grd(num1,num2){
        if(num2==0) return num1;
        return grd(num2,num1%num2);
    }
    
    if(denom1==denom2){
        answer.push(numer1+numer2);
        answer.push(denom1);
    }
    
    else if(denom1!=denom2){
        answer.push(numer1*denom2+numer2*denom1);
        answer.push(denom1*denom2);
    }
    
    var a=grd(answer[0],answer[1]);
    
    answer[0]=answer[0]/a;
    answer[1]=answer[1]/a;
    
    return answer;
}