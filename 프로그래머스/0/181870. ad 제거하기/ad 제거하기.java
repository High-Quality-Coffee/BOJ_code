import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList<String>();
        
        for(String s:strArr){
            if(s.contains("ad")) continue;
            list.add(s);
        }
        return list.toArray(new String[list.size()]);
     
    }
}