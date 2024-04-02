// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         StringBuilder new_a=new StringBuilder();
        
//         for(int i=0;i<a.length();i++){
//             char tmp=a.charAt(i);
//             if(Character.isLowerCase(tmp)) new_a.append(Character.toUpperCase(tmp));
//             else new_a.append(Character.toLowerCase(tmp));
//         }
//         System.out.print(new_a);
//     }
// }

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder new_a=new StringBuilder();
        
        for(int i=0;i<a.length();i++){
            char tmp=a.charAt(i);
            if(Character.isLowerCase(tmp)) new_a.append(Character.toUpperCase(tmp));
            else new_a.append(Character.toLowerCase(tmp));
        }
        System.out.print(new_a);
    }
}