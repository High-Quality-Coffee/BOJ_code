import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(pattern(i,j,n) ? "*" : " ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    public static boolean pattern(int i, int j, int num){
        if(num==1){
            return true;
        }

        int divide = num/3;
        if(i/divide == 1 && j/divide == 1){
            return false;
        }

        return pattern(i%divide, j%divide, divide);
    }
}