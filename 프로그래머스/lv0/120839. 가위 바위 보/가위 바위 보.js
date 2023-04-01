function solution(rsp) {
    var answer = '';
    rsp=rsp.split('')
    for(var i=0;i<rsp.length;i++){
        if(rsp[i]=='2') rsp[i]='0';
        else if(rsp[i]=='0') rsp[i]='5';
        else if(rsp[i]=='5') rsp[i]='2';
    }
    answer=rsp.join('');
    return answer;
}