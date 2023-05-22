function solution(emergency) {
    var answer = [];
    var Rcopy=[];
    for(var a=0;a<emergency.length;a++){
        Rcopy[a]=emergency[a];
    }
    
    emergency.sort((a,b)=>b-a);
    
    for(var i=0;i<Rcopy.length;i++){
        for(var j=0;j<emergency.length;j++){
            if(Rcopy[i]==emergency[j]){
                answer[i]=j+1;
                break;
            }
        }
    }
    
    return answer;
}