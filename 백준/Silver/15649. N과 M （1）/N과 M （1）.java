import java.util.*;
import java.io.*;

// tip: each public class is put in its own file
public class Main {
  static StringBuilder sb = new StringBuilder();
  static int n,m;
  static boolean[] visited;
  static int[] result;

  // tip: arguments are passed via the field below this editor
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    visited = new boolean[n+1];
    result = new int[m];

    dfs(0);
    System.out.print(sb); // 결과 출력
    
  }

  public static void dfs(int depth){
    // 깊이(m)가 같다면, stringbuilder에 담는다.
    if(depth == m){
      for(int i=0;i<m;i++){
        sb.append(result[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for(int i=1;i<=n;i++){
     if(visited[i]!=true){
       visited[i]=true;
       result[depth] = i;
       dfs(depth+1);
       visited[i]=false;
     } 
    }
  }

  
}