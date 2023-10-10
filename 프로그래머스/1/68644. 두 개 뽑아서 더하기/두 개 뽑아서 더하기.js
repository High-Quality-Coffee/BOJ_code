function solution(numbers) {
    var answer = [];
    //마지막 값으로 나머지 값들을 더하고 마지막 값 pop, 더한값들은 answer에 넣음
    var limit=numbers.length;
    
    for(let i=0;i<limit-1;i++){
        for(let i=1;i<numbers.length;i++){
            answer.push(numbers[0]+numbers[i]);
        }
        numbers.shift();
    }
    
    const set=new Set(answer);
    answer=[...set];
    answer.sort(function(a, b)  {
        return a - b;
    });
    //반복해서 진행.
    //배열이 비어있으면 종료.
    //중복제거
    //오름차순 정렬
    return answer;
}