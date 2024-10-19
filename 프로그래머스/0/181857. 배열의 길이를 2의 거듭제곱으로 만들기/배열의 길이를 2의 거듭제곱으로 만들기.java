class Solution {
    public static int getSquare(int limit){
        int sum=1;
        
        while(sum<limit){
            sum*=2;    
        }
        return sum;
    }
    
    public int[] solution(int[] arr) {
        int size = getSquare(arr.length);
        int[] answer = new int[size];
        
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}