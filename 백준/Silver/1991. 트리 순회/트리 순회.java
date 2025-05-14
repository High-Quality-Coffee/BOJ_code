import java.io.*;
import java.util.*;

class Main {
    public static Map<String, ArrayList<String>> tree = new HashMap<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a,b,c;
            a = st.nextToken();
            b = st.nextToken();
            c = st.nextToken();
            tree.put(a, new ArrayList<>(Arrays.asList(b,c)));
        }
        
        //전위 순회
        preOrder("A");
        System.out.println(sb);
        sb.setLength(0); //StringBuilder 초기화

        //중위 순회
        inOrder("A");
        System.out.println(sb);
        sb.setLength(0);

        //후위 순회
        postOrder("A");
        System.out.println(sb);
        sb.setLength(0);
    }

    //전위순회
    public static void preOrder(String node){
        //노드가 없으면 (.) 종료
        if(node.equals(".") || node == null){
            return;
        }

        sb.append(node);

        String left = tree.get(node).get(0);
        preOrder(left);
        String right = tree.get(node).get(1);
        preOrder(right);
    }

    //중위 순회
    public static void inOrder(String node){
        if(node.equals(".") || node == null){
            return;
        }

        String left = tree.get(node).get(0);
        inOrder(left);
        sb.append(node);
        String right = tree.get(node).get(1);
        inOrder(right);
    }

    //후위 순회
    public static void postOrder(String node){
        if(node.equals(".") || node == null){
            return;
        }

        String left = tree.get(node).get(0);
        postOrder(left);
        String right = tree.get(node).get(1);
        postOrder(right);
        sb.append(node);
    }

}