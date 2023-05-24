/*function solution(A, B) {
    var answer = 0;
    var copy;
    var Rcount=0,Lcount=0;
    var Acpy=A;
    var rAck=0, lAck=0;

    if(A===B) return 0;

    A=A.split('');
    Acpy=Acpy.split('');

    for(var i=0;i<A.length-1;i++){

        copy= A[0];
        A.shift();
        A=A.concat(copy);
        Rcount++;
        if(A.join('')===B){ rAck=1; break;}
    }

     for(var i=0;i<Acpy.length-1;i++){
        copy= Acpy[Acpy.length-1];
        Acpy.unshift(copy);
        Acpy.pop(copy);
        Lcount++;
        if(Acpy.join('')===B) {lAck=1; break;}
    }

    if(Rcount>Lcount && (rAck===1 || lAck===1))answer=Lcount;
    else if(Rcount<Lcount && (rAck===1 || lAck===1))answer=Rcount;
    else if(rAck===0 && lAck===0) answer=-1;
    else if(Rcount===Lcount && (rAck===1 || lAck===1))answer=Rcount;

    return answer;
}*/


function solution(A, B) {
  if (A.length !== B.length) {
    return -1;
  }

  let count = 0;
  while (A !== B) {
    A = A.slice(-1) + A.slice(0, -1); // 문자열을 오른쪽으로 한 칸씩 밀기
    count++;

    if (count > A.length) {
      // 모든 경우를 다 확인했는데도 B를 만들 수 없는 경우
      return -1;
    }
  }

  return count;
}