import java.util.Arrays;
import java.util.Scanner;

public class Main {
	 static boolean check(int[] a, int distance, int c) {
	        int cnt = 1;
	        int last = a[0]+distance;
	        for(int i=0; i<a.length; i++) {
	            if(a[i] >= last) {
	                cnt++;
	                last = a[i]+distance;
	            }
	        }
	        return cnt >= c;
	    }
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int c = sc.nextInt();
	        int [] a = new int[n];
	        
	        for(int i=0; i<n; i++){
	            a[i] = sc.nextInt();
	        }
	        
	        Arrays.sort(a);
	        int ans = 1;
	        int left = 1;
	        int right = a[n-1]-a[0];
	        
	        while (left <= right) {
	            int mid = (left+right)/2;
	            if (check(a, mid, c)) {
	                ans = Math.max(ans,mid);
	                left = mid+1;
	            } else {
	            	right = mid-1;
	            }
	        }
	        System.out.println(ans);
	    }
}
