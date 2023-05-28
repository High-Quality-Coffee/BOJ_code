function solution(quiz) {
    var answer = [];
    
    for(var i =0;i<quiz.length;i++){
        if(quiz[i].split(' ')[1]==='-'){
            (parseInt(quiz[i].split(' ')[0])-parseInt(quiz[i].split(' ')[2]))==parseInt(quiz[i].split(' ')[4]) ? answer.push('O') : answer.push('X');
        }
        else if(quiz[i].split(' ')[1]==='+'){
            (parseInt(quiz[i].split(' ')[0])+parseInt(quiz[i].split(' ')[2]))==parseInt(quiz[i].split(' ')[4]) ? answer.push('O') : answer.push('X');
        }
    }
    
    return answer;
}