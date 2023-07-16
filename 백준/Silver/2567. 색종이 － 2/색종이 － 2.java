import java.util.*;

public class Main {
		static int[] dx = {0, 0, 1, -1};
		static int[] dy = {-1, 1, 0, 0};	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int[][] papers = new int[101][101];
			int count = 0;
			
			for(int i=0; i<n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				for(int j=a; j<a+10; j++) {
					for(int k=b; k<b+10; k++) {
						papers[j][k] = 1;
					}
				}
			}
				
			for(int i=0; i<101; i++) {
				for(int j=0; j<101; j++) {
					if(papers[i][j]==1) {
						for(int k=0; k<4; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							if(nx<0 || ny<0 || nx>102 || ny>102) {
								continue;
							}
							if(papers[nx][ny]==0) {
								count++;
							}
						}
					}
				}
			}
			
			scanner.close();
			System.out.println(count);
		}
}