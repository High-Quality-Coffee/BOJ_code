import java.io.*;
import java.util.*;

class Main {
    public static class countryMedal implements Comparable<countryMedal>{
        int country_num, gold, silver, bronze;
        
        public countryMedal(int country_num, int gold, int silver, int bronze){
            this.country_num = country_num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        public int getGold(){
            return this.gold;
        }

        @Override
        public int compareTo(countryMedal country){
            if(this.gold != country.gold){
                return country.gold-this.gold;
            }
            if(this.silver != country.silver){
                return country.silver-this.silver;
            }
            return country.bronze-this.bronze;
        }
        
        public String getResult(){
            return gold+ " " + silver+ " " + bronze+" ";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int[] rank = new int[n];

        ArrayList<countryMedal> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int country_num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            list.add(new countryMedal(country_num, gold, silver, bronze));
        }

        Collections.sort(list);

        rank[0] = 1;

        for(int i=1;i<n;i++){

            if(list.get(i).gold == list.get(i-1).gold &&
            list.get(i).silver == list.get(i-1).silver &&
            list.get(i).bronze == list.get(i-1).bronze){
                rank[i] = rank[i-1];
            }else{
                rank[i] = rank[i-1]+1;
            }
            
        }

        int idx = 0;

        for(int i=0;i<n;i++){
            if(list.get(i).country_num == k){
                idx = i;
                break;
            }
        }

        System.out.println(rank[idx]);

    }
}