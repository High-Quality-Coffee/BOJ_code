import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] w_list = new int[n+1];
        int[] v_list = new int[n+1];

        int[] dp = new int[k+1];

        //물건 무게와 가치를 초기화
        for(int i =1;i<=n;i++){
            StringTokenizer st1= new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st1.nextToken());
            int v = Integer.parseInt(st1.nextToken());
            w_list[i] = w;
            v_list[i] = v;
        }

        for(int i=1; i<=n; i++){
            for(int j=k; j>=w_list[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-w_list[i]]+v_list[i]);
            }
        }

        System.out.println(dp[k]);

    }
}