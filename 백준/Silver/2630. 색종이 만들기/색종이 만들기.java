import java.io.*;
import java.util.*;

class Main {
    public static int zero_paper = 0;
    public static int one_paper = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] color_paper = new int[n][n];

        //입력 받기
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                color_paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide_paper(0, 0, n, color_paper);

        System.out.println(zero_paper);
        System.out.println(one_paper);

    }

    public static void divide_paper(int i, int j, int size, int[][] list){
        if(size == 1){
            if(list[j][i] == 0) zero_paper++;
            else one_paper++;
            return;
        }

        if(judge_final_paper(i, j, size, list)){
            if(list[j][i]==0) zero_paper++;
            else one_paper++;
            return;
        }

        divide_paper(i, j, size/2, list);
        divide_paper(i+size/2, j, size/2, list);
        divide_paper(i, j+size/2, size/2, list);
        divide_paper(i+size/2,j+size/2, size/2, list);
    }

    public static boolean judge_final_paper(int i, int j ,int size, int[][] list){
        int compare = list[j][i];
        
        for(int jdx = j ; jdx<j+size; jdx++){
            for(int idx = i ; idx<i+size; idx++){
                if(compare != list[jdx][idx]) return false;
            }
        }

        return true;
    }
}