function solution(num, total) {
    //배열의 합 구하기
    const add = arr => arr.reduce((a, b) => a + b, 0);
    
    var answer = [];
    for (var i=1;i<=num;i++){
        answer.push(i)
    }
    
    var sum = add(answer);
    
    while(sum!=total){
        if(sum<total){
            for(var i=0;i<num;i++)
                answer[i]+=1;        
            sum = add(answer);
        }
        else if (sum>total){
            for(var i=0;i<num;i++)
                answer[i]-=1;
            sum = add(answer);
        }
    }
        
    
    return answer;
}