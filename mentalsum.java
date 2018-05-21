import java.util.Scanner;

public class mentalsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 0; i < q + 1; i++) {
			mentsum((a + b * i) % 1000000007);
		}
		
	}
	
	public static void mentsum(int k) {
		String x = Integer.toString(k);
		int count = 0;
		
		while(x.length() > 1) {
			int thing = 0;
			for (int j = 0; j < x.length(); j++) {
				thing += (Integer.parseInt(x.charAt(j))) * (Integer.parseInt(x.charAt(j)));
			}
			x = Integer.toString(thing);
			count++;
		}
		System.out.println(count);
		
	}

}

/*
 * 
 * 
 * def mentsum(x):
    count = 0
    x = str(x)
    while len(x) > 1:
        new = 0
        for j in x:
            new += int(j) ** 2
        x = str(new)
        count += 1
    print count


if __name__ == '__main__':
    q, a, b = map(int, raw_input().split())
    for i in range(1, q + 1):
        mentsum((a + b * i) % 1000000007)

 * 
 */