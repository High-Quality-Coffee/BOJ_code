class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0,0);
    }
    
    private int dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 사용한 경우
        if (index == numbers.length) {
            // 합이 타겟과 같으면 1 반환
            return sum == target ? 1 : 0;
        }
        
        // 현재 숫자를 더하거나 빼는 두 가지 경우를 재귀적으로 탐색
        int add = dfs(numbers, target, index + 1, sum + numbers[index]);
        int subtract = dfs(numbers, target, index + 1, sum - numbers[index]);
        
        // 두 경우의 수를 합산
        return add + subtract;
    }
}