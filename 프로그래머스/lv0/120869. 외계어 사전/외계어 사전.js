function solution(spell, dic) {
    var answer = 0;
    var count=0;
    for(var i=0;i<dic.length;i++){
        for(var j=0;j<spell.length;j++){
            if(dic[i].indexOf(spell[j])>=0)count++;
            else break;
        }
        if(count==spell.length){
            return 1;
        }
        count=0;
    }
    
    answer=2;
    
    return answer;
}