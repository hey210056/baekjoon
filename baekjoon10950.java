package baekjoon;
import java.util.Scanner;

public class baekjoon10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int arr[] = new int[T];
		
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a+b;
		}
		sc.close();
		
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
