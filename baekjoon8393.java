package baekjoon;
import java.util.Scanner;

public class baekjoon8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		scan.close();
		int sum = 0;
		
		for(int k=1; k<=a; k++) {
			sum += k;
		}
		System.out.println(sum);
		
	}

}
