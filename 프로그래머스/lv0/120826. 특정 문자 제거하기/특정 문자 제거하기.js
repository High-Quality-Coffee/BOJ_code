function solution(my_string, letter) {
    var answer = '';   
    let letter1=new RegExp(letter,'g'); //등장하는 패턴모두를 탐색할수있도록 하는 정규식
    answer=my_string.replace(letter1,'');
    return answer;
}