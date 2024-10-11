class Solution {
    public int[] solution(long n) {
        String ns = n + "";
        String[] arr = new String[ns.length()];
        int[] answer = new int[ns.length()];
        
        arr = ns.split("");
        
        for(int i=arr.length-1;i>=0;i--){
            answer[arr.length-1-i] = Integer.valueOf(arr[i]);
        }
        
        
        return answer;
    }
}