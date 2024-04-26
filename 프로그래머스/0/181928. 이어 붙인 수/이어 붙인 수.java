class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder even=new StringBuilder();
        StringBuilder odd=new StringBuilder();
        String evenStr;
        String oddStr;
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                evenStr=""+num_list[i];
                even.append(evenStr);
            }
                
            else{
                oddStr=""+num_list[i];
                odd.append(oddStr);
            }
            
        }
        answer=Integer.parseInt(even.toString())+Integer.parseInt(odd.toString());
        return answer;
    }
}