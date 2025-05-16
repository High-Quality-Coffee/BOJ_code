import java.io.*;
import java.util.*;

class Main {
    public static int curve = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] list = new int[row][col];
        
        int x = 0;
        int y = 0;
        int spot = 0;

        int count = 1;
        list[0][0] = 1;

        while(count < row*col){
            int nx = x + dx[spot];
            int ny = y + dy[spot];

            if(nx>=0 && nx<col && ny>=0 && ny < row && list[ny][nx]!=1){
                list[ny][nx] = 1;
                x = nx;
                y = ny;
                count++;
            }else{
                spot = (spot+1)%4;
                curve++;
            }
            
        }

        System.out.println(curve);
    }
}