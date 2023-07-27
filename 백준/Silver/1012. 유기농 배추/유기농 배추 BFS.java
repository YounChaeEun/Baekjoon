import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 유기농배추_bfs {
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};
    static int m, n, k, t;
    static int board[][];
    static boolean visited[][];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();
            board = new int[m][n];
            visited = new boolean[m][n];
            int count=0;

            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                board[x][y] = 1;
            }

            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    if (visited[x][y] == true) continue;
                    if (board[x][y] == 0) continue;
                    bfs(x,y);
                    count++;
                }
            }

            System.out.println(count);
        }

    }

    static void bfs(int x, int y) {
        Queue<int[]> myqueue = new LinkedList<int[]>();
        myqueue.add(new int[] { x, y });

        while (!myqueue.isEmpty()) {
            x = myqueue.peek()[0];
            y = myqueue.peek()[1];
            visited[x][y] = true;
            myqueue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx<0 || nx>=m || ny<0|| ny>=n) continue;
                if (visited[nx][ny] == true) continue;
                if (board[nx][ny] == 0) continue;
                bfs(nx,ny);
            }
        }
    }
}
}