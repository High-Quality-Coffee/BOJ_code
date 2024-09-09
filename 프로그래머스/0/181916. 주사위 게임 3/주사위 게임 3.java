import java.util.*;

public class Solution {
    public static int solution(int a, int b, int c, int d) {
        // 주사위 숫자를 배열에 넣고 정렬
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        // 같은 숫자의 빈도를 저장하는 Map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : dice) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // 빈도별로 케이스 처리
        if (freq.size() == 1) {
            // 네 주사위 숫자가 모두 같음: 1111 * p
            return 1111 * dice[0];
        } else if (freq.size() == 2) {
            // 두 가지 숫자가 나왔을 때
            List<Integer> values = new ArrayList<>(freq.keySet());
            int first = values.get(0);
            int second = values.get(1);
            int countFirst = freq.get(first);
            int countSecond = freq.get(second);
            
            if (countFirst == 3 || countSecond == 3) {
                // 세 개가 같은 숫자: (10 * p + q)^2
                int p = countFirst == 3 ? first : second;
                int q = countFirst == 1 ? first : second;
                return (int) Math.pow(10 * p + q, 2);
            } else {
                // 두 개씩 같은 숫자: (p + q) * |p - q|
                return (first + second) * Math.abs(first - second);
            }
        } else if (freq.size() == 3) {
            // 두 개의 주사위에서 같은 숫자가 나오고, 나머지 두 숫자가 각각 다른 경우
            int p = 0, q = 0, r = 0;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() == 2) {
                    p = entry.getKey();
                } else if (q == 0) {
                    q = entry.getKey();
                } else {
                    r = entry.getKey();
                }
            }
            return q * r;
        } else {
            // 네 숫자가 모두 다름: 가장 작은 숫자 반환
            return dice[0];
        }
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution(2, 2, 5, 6)); // 5 * 6 = 30
        System.out.println(solution(2, 2, 2, 2)); // 1111 * 2 = 2222
        System.out.println(solution(4, 4, 4, 6)); // (10 * 4 + 6)^2 = 1600
        System.out.println(solution(6, 6, 4, 4)); // (6 + 4) * |6 - 4| = 20
        System.out.println(solution(6, 5, 4, 3)); // 가장 작은 숫자 = 3
    }
}
