import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<String>();
        Map<Character, Long> weight = new HashMap<>();

        for(int i=0;i<n;i++){
            list.add(br.readLine());
        }

        for(String s : list){
            int size = s.length();
            for(int i=0;i<size;i++){
                char c = s.charAt(i);
                long pow = (long) Math.pow(10, size-i-1);
                weight.put(c, weight.getOrDefault(c,0L)+pow);
            }
        }

        ArrayList<Map.Entry<Character, Long>> weightList = new ArrayList<>(weight.entrySet());
        Collections.sort(weightList, (a,b)->b.getValue().compareTo(a.getValue()));

        Map<Character, Integer> digitMap = new HashMap<>();
        int digit = 9;

        // 단어들의 가중치 정하기
        for(Map.Entry<Character, Long> weightSet : weightList){
            digitMap.put(weightSet.getKey(), digit--);
        }

        long result = 0;
        for(String s : list){
            long num = 0;
            for(char c : s.toCharArray()){
                num = num*10 + digitMap.get(c);    
            }
            result += num;
        }

        System.out.println(result);

    }
}