function solution(numbers, direction) {
    
     var answer = [];
    if(direction=="right"){
        for(var i=1;i<numbers.length;i++){
            answer[i]=numbers[i-1];
        }
        answer[0]=numbers[numbers.length-1];
    }
    else if(direction=="left"){
        for(var j=0;j<numbers.length-1;j++){
            answer[j]=numbers[j+1];
        }
        answer[numbers.length-1]=numbers[0];
    }
        
   
    return answer;
}