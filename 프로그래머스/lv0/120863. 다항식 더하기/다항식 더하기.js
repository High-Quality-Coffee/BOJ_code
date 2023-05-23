function solution(polynomial) {
    var answer = '';  var ary=[]; var ce=0; var cn=0;
    
    ary=polynomial.split(' ')
    
   for(var i=0;i<ary.length;i++){
        if(ary[i].includes('x')) {
            if(ary[i].split('x').shift()==='') ce+=1;
            else ce+=parseInt(ary[i].split('x').shift());
        }
        else if(ary[i].includes('+')) continue;
        else cn+=parseInt(ary[i]);
   } 
    if(cn==0&&ce!=1)answer=ce.toString()+'x';
    else if(cn==0&&ce==1)answer='x';
    else if(ce==0) answer= cn.toString();
    else if(cn==0&&ce==0)answer="";
    else if(ce!=1)answer=ce.toString()+'x + '+cn.toString();
    else answer='x + '+cn.toString();
    return answer;
}