/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static class Meeting{
	    int start;
	    int end;
	    
	    public Meeting(int start,int end){
	        this.start = start;
	        this.end = end;
	    }
	}
	
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    ArrayList<Meeting> list = new ArrayList<>();
	    int count = 1;
	    
	    for(int i=0;i<n;i++){
	        StringTokenizer st = new StringTokenizer(br.readLine());
    	    int start = Integer.parseInt(st.nextToken());
    	    int end = Integer.parseInt(st.nextToken());
    	    list.add(new Meeting(start,end));
	    }
	    
	    //회의 종료시간 기준으로 정렬
	    Collections.sort(list, (a,b)->{
	        if(a.end!=b.end){
	            return Integer.compare(a.end, b.end);
	        }
	        
	        return Integer.compare(a.start, b.start);
	    });
	    
	    int end = list.get(0).end;
	    
	    //리스트를 순회하면서 최대 회의 수 카운트
	    for(int i=1;i<n;i++){
	        if(end<=list.get(i).start){
	            count++;
	            end = list.get(i).end;
	        }
	    }
	    
	    System.out.println(count);
	}
	
	
}