import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();

        // for 문을 사용하여 배열의 각 요소를 ArrayList 에 추가
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 뒤에서부터 요소를 삭제
                for (int j = list.size() - 1; j > query[i]; j--) {
                    list.remove(j);
                }
            } else {
                // 앞에서부터 요소를 삭제할 때는 앞에서부터 삭제하도록 루프를 뒤집음
                for (int k = query[i] - 1; k >= 0; k--) {
                    list.remove(k);
                }
            }
        }

        return list;
    }
}
