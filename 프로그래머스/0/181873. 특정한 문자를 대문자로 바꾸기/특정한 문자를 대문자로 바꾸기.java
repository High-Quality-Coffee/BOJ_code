// class Solution {
//     public String solution(String my_string, String alp) {
//         return my_string.replace(alp, alp.toUpperCase());
//     }
// }

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.charAt(i) + "";
            if(s.equals(alp)){
                s = s.toUpperCase();
            }
            answer += s;
        }
        return answer;
    }
}