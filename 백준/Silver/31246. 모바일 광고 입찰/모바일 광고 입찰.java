import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //두 가지 수의 차를 저장
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
    
        for(int i =0;i<n;i++){
            StringTokenizer ad = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(ad.nextToken());
            int b = Integer.parseInt(ad.nextToken());
            list.add(a-b);
        }

        //리스트를 오름차순
        Collections.sort(list, Collections.reverseOrder());
        
        count = list.get(k-1);

        if(count<0){
            System.out.println(count*-1);
        }else{
            System.out.println(0);
        }

    }
}