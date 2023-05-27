function solution(array, n) {
    var answer = 0;
    var min=100;
    array=array.sort();
    for (var i=0;i<array.length;i++){
        if(min>Math.abs(array[i]-n)){
            min=Math.abs(array[i]-n);
            answer=array[i];
        }
    }
    return answer;
}