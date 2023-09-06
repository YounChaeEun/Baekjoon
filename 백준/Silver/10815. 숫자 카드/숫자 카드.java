import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine()); 
		int cards[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cards);
		
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		 st = new StringTokenizer(br.readLine());
		 
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(check(cards, num) + " ");
		}
		
		bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
	}
	
	static int check(int[] cards, int M) {
		int left = 0; 
		int mid; 
		int right = cards.length - 1;
		
		while(left <= right) {
			mid = (left+right)/2;
			if(M > cards[mid]) {
				left = mid + 1;
			} else if(M < cards[mid]) {
				right = mid - 1;
			} else {
				return 1;
			}
		}
		return 0;
	}
}