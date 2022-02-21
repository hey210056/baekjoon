package baekjoon;
import java.util.Scanner;

public class baekjoon10950_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] arr = new int[t];
		
		for(int i=0; i<t ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		/*
		for(int j=0; j<t ; j++) {
			System.out.println(arr[j]);
		}
		*/
		for(int array: arr) {
			System.out.println(array);
		}

	}

}
