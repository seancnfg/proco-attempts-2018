import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
	public static void main(String [] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		System.out.println(a);
		
		String str = Integer.toString(a);
		
		System.out.println(str + "ay");
	}
}
