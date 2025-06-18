import java.io.*;
import java.util.*;

class Main {
    static class Node implements Comparable<Node> {
        int index, weight;

        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        // 가중치 우선, 가중치가 같으면 정점 순으로 정렬
        @Override
        public int compareTo(Node other) {
            if (this.weight != other.weight) {
                return Integer.compare(this.weight, other.weight); // 가중치 오름차순
            }
            return Integer.compare(this.index, other.index); // 정점 오름차순
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 도시의 개수
        int m = Integer.parseInt(br.readLine()); // 버스의 개수

        // 인접 리스트 초기화
        ArrayList<Node>[] list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        // 입력 처리 (중복 간선 최적화)
        Map<String, Integer> edgeMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            String key = a + "," + b;
            // 최소 비용만 저장
            edgeMap.put(key, Math.min(edgeMap.getOrDefault(key, Integer.MAX_VALUE), c));
        }

        // 인접 리스트에 간선 추가 및 정렬
        for (Map.Entry<String, Integer> entry : edgeMap.entrySet()) {
            String[] ab = entry.getKey().split(",");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int c = entry.getValue();
            list[a].add(new Node(b, c));
        }

        // 각 인접 리스트를 가중치 우선, 정점 순으로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        // 다익스트라 알고리즘
        int[] d = new int[n + 1];
        int[] prev = new int[n + 1];
        Arrays.fill(d, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        d[start] = 0;

        PriorityQueue<Node> q = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));
        q.offer(new Node(start, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            int idx = node.index;
            int value = node.weight;

            if (d[idx] < value) continue;

            for (Node next : list[idx]) {
                int cost = d[idx] + next.weight;
                if (cost < d[next.index]) {
                    d[next.index] = cost;
                    prev[next.index] = idx;
                    q.offer(new Node(next.index, cost));
                }
            }
        }

        // 경로 역추적
        List<Integer> answer = new ArrayList<>();
        int current = end;
        while (current != -1) {
            answer.add(current);
            current = prev[current];
        }

        // 출력
        System.out.println(d[end]);
        System.out.println(answer.size());
        for (int i = answer.size() - 1; i >= 0; i--) {
            System.out.print(answer.get(i) + " ");
        }
    }
}