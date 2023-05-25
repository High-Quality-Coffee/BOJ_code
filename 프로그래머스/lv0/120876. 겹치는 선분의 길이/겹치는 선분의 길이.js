// function solution(lines) {
//     var answer = 0;
    
//     lines.sort((a,b)=>a[0]+a[1]-(b[0]+b[1]));
    
//     for (var i=0;i<2;i++){
//         if((lines[i][1]>lines[i+1][0])&&(lines[i][1]>=lines[i+1][1]))
//             answer+=(lines[i+1][1]-lines[i+1][0]);
//         else if(lines[i][1]>lines[i+1][0])
//              answer+=(lines[i][1]-lines[i+1][0]);
//     }
    
//     if((lines[0][1]>lines[2][0])&&(lines[0][1]>=lines[2][1]))
//             answer-=(lines[2][1]-lines[2][0]);
//     else if(lines[0][1]>lines[2][0])
//             answer-=(lines[0][1]-lines[2][0]);
    
    
//     return answer;
// }

//-값이면 그 값의 절대값을 더한다 즉, 밀어서 대칭이동시켜서 풀어보자
function solution(lines) {
    var answer = 0;
    var ary=[];
    
    //lines.sort((a,b)=>a[0]+a[1]-(b[0]+b[1]));
    
    var mini=Math.min(...lines.flat());
    
    if(mini<0){ //대칭이동
        mini=mini*(-1);
        for(var i=0;i<3;i++){
            lines[i][0]+=mini; lines[i][1]+=mini;
        }
    }
    
    
    for(var i=0;i< Math.max(...lines.flat());i++){
        
        ary[i]=0;
        
    }
    
    for(var i=0;i<3;i++){    
        for(var j=lines[i][0];j<lines[i][1];j++){
            ary[j]+=1;    
        }
    }
    
    for(var i=0;i< Math.max(...lines.flat());i++){
        if(ary[i]>1) {answer++;}
    }
    
    return answer;
 }
