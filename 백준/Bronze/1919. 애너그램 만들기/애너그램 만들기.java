import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int a_length = a.length();
        int b_length = b.length();

        StringBuilder sb_a = new StringBuilder(a);
        StringBuilder sb_b = new StringBuilder(b);
        StringBuilder sb_answer = new StringBuilder();

        int count = 0;

        for(int i=0;i<sb_a.length();i++){
            int idx = sb_b.indexOf(String.valueOf(sb_a.charAt(i)));
            if(idx>=0){
                sb_b.deleteCharAt(idx);
                count++;
            }
        }
        int result = (a_length-count) + (b_length-count);
        
        System.out.println(result);
    }
}