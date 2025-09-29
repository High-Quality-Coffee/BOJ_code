import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        ArrayList<Integer> p_list = new ArrayList<>(); //양수만 넣는 리스트
        ArrayList<Integer> n_list = new ArrayList<>(); //0과 음수만 넣는 리스트

        for(int i=0;i<test_case;i++){
            int value = Integer.parseInt(br.readLine());
            if(value>0) p_list.add(value);
            else n_list.add(value);
        }

        Collections.sort(p_list);
        Collections.sort(n_list);

        int p_fidx=p_list.size()-1;
        int p_sidx=p_list.size()-2;
        int p_addValue = 0;
        int p_mulValue = 0;

        int n_fidx = 0;
        int n_sidx = 1;
        int n_addValue = 0;
        int n_mulValue = 0;

        int sum = 0;

        while(p_fidx>=0){

            if(p_sidx<0){
                p_addValue = p_list.get(p_fidx);
                p_mulValue = p_list.get(p_fidx);
            }else{
                p_addValue = p_list.get(p_fidx) + p_list.get(p_sidx);
                p_mulValue = p_list.get(p_fidx) * p_list.get(p_sidx);
            }

            if(p_addValue <= p_mulValue){
                sum+=p_mulValue;
            }else{
                sum+=p_addValue;
            }

            p_fidx-=2;
            p_sidx-=2;
        }

        while(n_fidx <= n_list.size()-1){
            
            if(n_sidx > n_list.size()-1){
                n_addValue = n_list.get(n_fidx);
                n_mulValue = n_list.get(n_fidx);
            }else{
                n_addValue = n_list.get(n_fidx) + n_list.get(n_sidx);
                n_mulValue = n_list.get(n_fidx) * n_list.get(n_sidx);
            }

            if(n_addValue <= n_mulValue){
                sum+=n_mulValue;
            }else{
                sum+=n_addValue;
            }

            n_fidx+=2;
            n_sidx+=2;
        }

        System.out.println(sum);

    }
}