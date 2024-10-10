class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int last = myString.lastIndexOf(pat)+pat.length();
        
        return myString.substring(0,last);
        
     
    }
}