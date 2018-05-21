import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String str = sc.next();
		String tStr = sc.next();
		
		if(str.contains(tStr))
			System.out.println(1);
		else
			System.out.println(0);
		
		
		if(tStr.contains(str))
			System.out.println(1);
		else
			System.out.println(0);
		
	}

}
