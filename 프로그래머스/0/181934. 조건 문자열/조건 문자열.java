// class Solution {
//     public int solution(String ineq, String eq, int n, int m) {
//         int answer = 0;
//         String equation_eq=(""+n) + (ineq + eq)+ (""+m);
//         String equation = (""+n) + ineq + (""+m);
//         Boolean bool_eq=Boolean.parseBoolean(equation_eq);
//         Boolean bool=Boolean.parseBoolean(equation);
        
//         if(eq.equals("!"))
//             answer=bool?1:0;
//         else
//             answer=bool_eq?1:0;  
//         return answer;
        
//     }
// }

class Solution{
    public int solution(String ineq, String eq, int n, int m){
        int answer=0;
        if(ineq.equals("<")){
            if(eq.equals("=")) answer=(n<=m)?1:0;
            else answer=(n<m)?1:0;
        }
        else{
            if(eq.equals("=")) answer=(n>=m)?1:0;
            else answer=(n>m)?1:0; 
        }
        return answer;
    }
}