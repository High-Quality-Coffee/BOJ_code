function solution(score) {
    var answer = [];
    var avg=[];
    var copy=[];
    
    for (var i=0;i<score.length;i++){
        avg[i]=(score[i][0]+score[i][1])/2;    
    }
    
    
    copy = avg.slice();
    
    avg.sort(function(a,b){
        return b-a;
    });
    
    for(var i=0;i<copy.length;i++){
        for(var j=0;j<avg.length;j++){
           if(copy[i]===avg[j]) answer[i]=avg.indexOf(avg[j])+1;  
        }
    }
    
    return answer;
}