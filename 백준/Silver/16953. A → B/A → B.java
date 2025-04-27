import java.util.*;
import java.io.*;

public class Main{
  public static long a,b;
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());

    System.out.print(bfs(a,b));
  }

  public static class State{
    long num;
    int step;
    public State(Long num, int step){
      this.num = num;
      this.step=step;
    }
  }

  public static int bfs(long a, long b){
    Deque<State> q = new LinkedList<>();
    Set<Long> list = new HashSet<>();
    
    q.add(new State(a,0));
    list.add(a);

    while (!q.isEmpty()){
      State state = q.poll();
      long num = state.num;
      int step = state.step;

      if(num==b){
        return step+1;
      }

      long nextNum = num*2;
      if(nextNum<=b && !list.contains(nextNum)){
        q.add(new State(nextNum, step+1));
        list.add(nextNum);
      }

      nextNum = num*10+1;
      if(nextNum<=b && !list.contains(nextNum)){
        q.add(new State(nextNum, step+1));
        list.add(nextNum);
      }
    }
    return -1;
      
  }
  
}
