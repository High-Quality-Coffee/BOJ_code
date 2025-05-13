import java.io.*;
import java.util.*;

class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sb.append((int)Math.pow(2, n)-1).append("\n");

        hanoi(n, 1, 2, 3);

        System.out.println(sb);
    }
    
    public static void hanoi(int n, int from, int mid, int to){
            if(n==1){
                sb.append(from+" "+to+"\n");
                return;
            }

            hanoi(n-1, from, to, mid);
            sb.append(from+" "+to+"\n");
            hanoi(n-1, mid,from,to);
    }
}