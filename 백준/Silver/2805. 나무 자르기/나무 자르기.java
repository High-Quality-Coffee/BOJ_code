import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long[] trees = new long[N];
        
        st = new StringTokenizer(br.readLine());
        long maxHeight = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            maxHeight = Math.max(maxHeight, trees[i]);
        }
        
        long left = 0, right = maxHeight;
        long answer = 0;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            
            for (long height : trees) {
                if (height > mid) {
                    sum += height - mid;
                }
            }
            
            if (sum >= M) {
                answer = mid; // 가능한 H 저장
                left = mid + 1; // 더 큰 H 탐색
            } else {
                right = mid - 1; // H 낮춤
            }
        }
        
        System.out.println(answer);
    }
}