import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int r = 31;
        int m = 1234567891;
        int sum = 0;

        for(int i=0;i<l;i++){
            sum += (str.charAt(i)-'a'+1) * Math.pow(r,i);
        }

        System.out.println(sum%m);
    }
}