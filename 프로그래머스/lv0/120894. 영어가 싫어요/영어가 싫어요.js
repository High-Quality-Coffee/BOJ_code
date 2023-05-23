function solution(numbers) {
    var answer = '';
    var a=[];
    var str=[];
    
    var alpha=["zero","one","two","three","four","five","six","seven","eight","nine"];
    while(numbers!=''){
        for(var j=0;j<10;j++){
            if(numbers.substring(0,3)==alpha[j]){
                answer=answer.concat(j);
                numbers=numbers.replace(alpha[j],'');
                continue;
            }
            else if(numbers.substring(0,4)==alpha[j]){
                answer=answer.concat(j);
                numbers=numbers.replace(alpha[j],'');
                continue;
            }
            else if(numbers.substring(0,5)==alpha[j]){
                answer=answer.concat(j);
                numbers=numbers.replace(alpha[j],'');
                continue;
            }
        }
    }
    
    return Number(answer);
}