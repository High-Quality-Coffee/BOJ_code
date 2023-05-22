function solution(n) {
   
    var ary=[];
    var num=1;
    var index=1;
    while(true){
        if(index==101)break;
        if(num%3!=0&&num!=3&&Math.floor(num/10)!=3&&num%10!=3&&Math.floor(num%100/10)!=3){
            ary[index]=num;
            index++;
        }
        num++;
    }
    
    return ary[n];
}