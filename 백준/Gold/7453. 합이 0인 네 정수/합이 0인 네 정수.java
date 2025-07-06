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

        long[] list_a = new long[n*n];
        long[] list_b = new long[n*n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());
        }
        
        int idx = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list_a[idx] = (long)(a[i] + b[j]);
                list_b[idx] = (long)(c[i] + d[j]);
                idx++;
            }
        }
        Arrays.sort(list_a);
        Arrays.sort(list_b);

        long count = 0;
        for(int i=0;i<n*n;i++){
            long target = list_a[i] * -1;
            int sum = upper(target, list_b,n) - lower(target, list_b,n);
            count+=sum;
        }

        System.out.println(count);
    }

    public static int lower(long target, long[] arr, int n){
        int left = 0;
        int right = n*n;

        while(left<right){
            int mid = left + (right - left) / 2;

            if(arr[mid] >= target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        
        return left;
    }

    public static int upper(long target, long[] arr, int n){
        int left = 0;
        int right = n*n;

        while(left<right){
            int mid = left + (right - left) / 2;

            if(arr[mid] > target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }
}