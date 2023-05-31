function solution(age) {
    var answer = '';
    var alpha=['a','b','c','d','e','f','g','h','i','j'];
    
    age=age.toString();
    
    for(var i=0; i<age.length ; i++){
       answer+=alpha[age[i]];
    }
        
    return answer;
}