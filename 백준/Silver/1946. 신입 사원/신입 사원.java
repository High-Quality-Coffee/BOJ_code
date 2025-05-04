import java.util.*;
import java.io.*;


public class Main{

  public static class test{
    public int first;
    public int second;

    public test(int first, int second){
      this.first = first;
      this.second = second;
    }

    public int getSum(){
      return this.first + this.second;
    }

    public int getFirst(){
      return this.first;
    }

    public int getSecond(){
      return this.second;
    }

  }
  
  public static void main(String[] args) throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int[] count = new int[t];
    
    
    //2개의 합이 가장 작은 것이 1등
    //1등과 비교하여 2가지 모두 1등 보다 뒤쳐진다면 제외, 아니면 Count(1개는 1등보다 우위에 있음)
    for(int i=0; i<t;i++){
      int apply_number=Integer.parseInt(br.readLine());
      ArrayList<test> list = new ArrayList<>();
      
      for(int j=0;j<apply_number;j++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        list.add(new test(a,b));
      }

      Collections.sort(list, (a,b)->Integer.compare(a.first, b.first));

      count[i]+=1;

      int minSecond = list.get(0).second;

      for(int j=1;j<apply_number;j++){
        if(minSecond>list.get(j).second){
          count[i]+=1;
          minSecond=list.get(j).second;
        }
      }
    }

    for(int i=0;i<t;i++){
      System.out.println(count[i]);
    }
  }

  
}

