package baekjoon;
import java.util.Scanner;

public class baekjoon15552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int c = scan.nextInt();
		int arr[] = new int[c];
		
		for(int k=0; k<c; k++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			arr[k] = a + b;
		}
		
		for(int k:arr) {
			System.out.println(k);
		}
		scan.close();
	}

}
