class Solution {
    int[] answer = new int[5];
    public static int[] pos = new int[2];
    
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {-1, 1, 0, 0};
    
    public int[] solution(String[][] places) {
        for (int i = 0; i < 5; i++) {
            if (checkP(places[i])) {
                answer[i] = 1;
                continue;
            }
            boolean isSafe = true;
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 5; y++) {
                    if (places[i][x].charAt(y) == 'P') {
                        if (checkD_one(places[i], x, y) || checkD_two(places[i], x, y)) {
                            isSafe = false;
                            break;
                        }
                    }
                }
                if (!isSafe) break;
            }
            answer[i] = isSafe ? 1 : 0;
        }
        return answer;
    }
    
    public boolean checkP(String[] room) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (room[i].charAt(j) == 'P') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkD_one(String[] room, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                if (room[nx].charAt(ny) == 'P') return true;
            }
        }
        return false;
    }
    
    public boolean checkP_count(String[] room, int x, int y) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && room[nx].charAt(ny) == 'P') {
                count++;
            }
        }
        return count >= 2;
    }
    
    public boolean checkD_two(String[] room, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && room[nx].charAt(ny) == 'O') {
                if (checkP_count(room, nx, ny)) return true;
            }
        }
        return false;
    }
}
