import java.util.*;
import java.io.*;
public class Main{
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
          br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
          while (st == null || !st.hasMoreElements()){
            try { st = new StringTokenizer(br.readLine()); }
            catch (IOException e) { e.printStackTrace(); }
          }
          return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble(){ return Double.parseDouble(next()); }
        String nextLine(){
          String str = "";
          try { str = br.readLine(); }
          catch (IOException e) { e.printStackTrace(); }
          return str;
        }
    }
	
	public static void main(String args[]){
	    FastReader in = new FastReader();
	    
	    int tc = in.nextInt();
	    while(tc--> 0) {
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
          arr[ i ] = in.nextInt();
        }
        check(n, arr);
      }
      //System.out.println();
      //int[] arr= Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	}	
  static void check(int n, int[] arr){
    int[] right = new int[n];
    int[] left = new int[n];
    for(itn i=0; i<n-1; i++){
      if(arr[i] >= arr[i+1]){
        right[i] = arr[i+1]-1;
      }else right[i] = -1;
    }
    for(itn i=1; i<=n; i++){
      if(arr[i] <= arr[i])
    }
  }



  

  
}