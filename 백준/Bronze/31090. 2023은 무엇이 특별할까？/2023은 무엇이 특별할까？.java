import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++){
            int year = Integer.parseInt(br.readLine());
            int plusYear = year + 1;
            int remainder = year % 100;
            
            if(plusYear % remainder == 0){
                System.out.println("Good");
            }else{
                System.out.println("Bye");
            }
            
        }
    }
}