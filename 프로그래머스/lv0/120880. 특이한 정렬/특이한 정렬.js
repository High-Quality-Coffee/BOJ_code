// function solution(numlist, n) {
//     var answer = [];
//     var copy = new Array(numlist.length);
    
//     for (var i=0;i<numlist.length;i++){
//         if((numlist[i]-n)<0)
//             copy[i]= (-1*(numlist[i]-n));
//         else
//             copy[i]=(numlist[i]-n);
//     }
    
//     copy.sort();
    
//     for (var i=0;i<copy.length;i++){
//         if(i==0)
//             answer[i]=copy[i]+n;
        
//         else if(copy[i]==copy[i-1])
//             answer[i]=(n-copy[i]);
//         else
//             answer[i]=(copy[i]+n);
//     }
    
//     return answer;
// }


function solution(numlist, n) {
    // Custom sorting function
    function customSort(a, b) {
        const diffA = Math.abs(a - n);
        const diffB = Math.abs(b - n);

        if (diffA === diffB) {
            return b - a; // If the distances are the same, sort by larger value first
        }

        return diffA - diffB; // Sort by absolute difference to n
    }

    // Sort numlist using the custom sorting function
    numlist.sort(customSort);

    return numlist;
}


