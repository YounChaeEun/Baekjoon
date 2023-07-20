import java.util.Scanner;

public class Main{
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int m, n, k, t;
	static int board[][];
	static boolean visited[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			board = new int[m][n];
			visited = new boolean[m][n];
			
			for (int j = 0; j < k; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				board[x][y] = 1;
			} 
			
			int count = 0;
			
			for (int x = 0; x < m; x++) {
				for (int y = 0; y < n; y++) {
					if (visited[x][y] == true) continue;
					if (board[x][y] == 0) continue;
					dfs(x,y);
					count++;
				}
			}
			
			System.out.println(count);
		}
		
		sc.close();
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx<0 || nx>=m || ny<0|| ny>=n) continue;
			if (visited[nx][ny] == true) continue;
			if (board[nx][ny] == 0) continue;
			dfs(nx,ny);
		}
	}
}