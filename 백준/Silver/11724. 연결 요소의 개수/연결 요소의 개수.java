import java.util.*;

public class Main {
	static int a;
	static int b;
	static boolean[] visited;
	static int[][] graph;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		visited = new boolean[a+1];
		graph = new int[a+1][a+1];

		for(int i=0; i<b; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			graph[j][k]=1;
			graph[k][j]=1;	
		}
		for(int i=1; i<=a; i++) {
			if(!visited[i]) {
				dfs(i);
				answer++;
			}
		}
		System.out.println(answer);
		sc.close();
		
	}
	public static void dfs(int startNode) {
		visited[startNode] = true;
		for(int i=0; i<a+1; i++) {
			if(!visited[i] && graph[startNode][i]==1) {
				dfs(i);
			}
		}
	}
}