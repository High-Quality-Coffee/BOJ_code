import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];

        // 입력 처리
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());
        }

        // list_a: a[i] + b[j]의 모든 합
        // list_b: c[k] + d[l]의 모든 합
        long[] list_a = new long[n * n];
        long[] list_b = new long[n * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list_a[idx] = (long) a[i] + b[j];
                list_b[idx] = (long) c[i] + d[j];
                idx++;
            }
        }

        // list_a와 list_b 정렬
        Arrays.sort(list_a);
        Arrays.sort(list_b);

        // list_a의 각 값에 대해 list_b에서 -list_a[i]의 빈도 계산
        long count = 0;
        for (int i = 0; i < n * n; i++) {
            long target = -list_a[i];
            int upper = upperBound(list_b, target, n);
            int lower = lowerBound(list_b, target, n);
            count += (upper - lower); // target의 빈도
        }

        System.out.println(count);
    }

    // Lower Bound: target 이상인 첫 번째 인디
    public static int lowerBound(long[] arr, long target, int n) {
        int left = 0;
        int right = n * n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Upper Bound: target을 초과하는 첫 번째 인덱스
    public static int upperBound(long[] arr, long target, int n) {
        int left = 0;
        int right = n * n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}