function solution(dots) {    
    var gra=[];
    var comp=[];
    var answer=0;
    for(var i=0;i<dots.length-1;i++){
        for(var j=i+1;j<dots.length;j++){
            if((dots[i][0]-dots[j][0])==0)
                continue;
            else
                gra.push((dots[i][1]-dots[j][1])/(dots[i][0]-dots[j][0]));
        }
    }
    
    if(gra[0]==gra[5])answer=1;
    if(gra[1]==gra[4])answer=1;
    if(gra[2]==gra[3])answer=1;
    
    return answer;
    
}