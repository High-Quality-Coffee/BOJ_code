import java.util.*;
import java.io.*;

public class Main{
  public static int zero_count = 0;
  public static int one_count=0;
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();

    String[] oneAry = Arrays.stream(s.split("0"))
              .filter(a->!a.isEmpty())
              .toArray(String[]::new);
      
    String[] zeroAry = Arrays.stream(s.split("1"))
      .filter(a->!a.isEmpty())
      .toArray(String[]::new);

    int oneSize = oneAry.length;
    int zeroSize = zeroAry.length;

    System.out.println(Math.min(oneSize, zeroSize));
    
    
  }
}