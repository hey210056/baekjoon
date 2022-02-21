package baekjoon;
import java.util.Scanner;
public class baekjoon2557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int d = b / 100;
		int e = (b -d*100)/10;
		int f = (b - d*100 - e*10);
		int c = a * b;
		int g = a * f;
		int h = a * e;
		int i = a * d;
		
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(c);
	}

}
