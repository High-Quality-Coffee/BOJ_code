import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int[] pre = Arrays.copyOf(num_list,n);
        int[] post = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] sum = new int[pre.length+post.length];
        
        System.arraycopy(post,0,sum,0,post.length);
        System.arraycopy(pre, 0, sum, post.length, pre.length);
        
        return sum;
    }
}