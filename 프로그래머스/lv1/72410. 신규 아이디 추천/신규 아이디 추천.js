// function solution(new_id) {
//     var answer = '';
//     var compare='';
    
//     var patternN = /[0-9]/; //숫자
//     var patternA = /[a-z]/; //영어
//     var patternR = /[-_.]/; //Rule
//     var patternS = /~!@#$%^&*()=+[{]}:?,<>\//;
    
//     //step1
//     new_id=new_id.toLowerCase();
//     //step2
//     for(let i=0;i<new_id.length;i++){
//         if(patternS.test(new_id[i])){
//             answer=new_id.replace(new_id[i],"");
//         }
//     }
//     //step3
//     while(true){
//         compare=answer;
//         answer=answer.replace("..","");
//         if(answer==compare)
//             break;
//     }
    
//     //step4
//     if(answer[0]=='.')
//         answer=answer.replace(answer[0],"");
//     else if(answer[answer.length-1]=='.')
//         answer=answer.replace(answer[answer.length-1],"");
    
//     //step5
//     if(answer=="")
//         answer="a";
    
//     //step6
//     if(answer.length>=16){
//         answer=answer.substring(0,15);
//         if(answer[answer.length-1]=='.')
//             answer=answer.replace(answer[answer.length-1],"");
//     }
    
//     //step7
//     if(answer.length<=2){
//         for(let i=0;answer.length<=3;i++)
//             answer=answer.concat(answer[answer.length-1]);
//     }
    
    
    
//     return answer;
// }



function solution(new_id) {
    var answer = '';

    // Step 1
    new_id = new_id.toLowerCase();

    // Step 2
    answer = new_id.replace(/[^a-z0-9-_.]/g, "");

    // Step 3
    answer = answer.replace(/\.{2,}/g, ".");

    // Step 4
    answer = answer.replace(/^\.|\.$/g, "");

    // Step 5
    if (answer === "") {
        answer = "a";
    }

    // Step 6
    if (answer.length >= 16) {
        answer = answer.substring(0, 15);
        answer = answer.replace(/\.$/, "");
    }

    // Step 7
    while (answer.length <= 2) {
        answer += answer.charAt(answer.length - 1);
    }

    return answer;
}
