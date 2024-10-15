class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for(int i:arr) size+=i;
        int[] answer = new int[size];
        int idx=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++) answer[idx++]=arr[i];
        }
        
        
        return answer;
    }
    
    public void add(){
        
    }
}