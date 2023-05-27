function solution(my_str, n) {
    var answer = [];
    var times=(my_str.length/n)+1;
    if((my_str.length%n)==0)times=times-1;
    
    var i=0;
    var count=0;
    for(var a=0;a<times;a++){
        if(a==(times-1)){
            answer.push(my_str.substr(i));
        }
        else {
            answer.push(my_str.substr(i,n));
            i=i+n;
        }
        if(answer[answer.length-1]=='') answer.pop();
    }
    return answer;
}