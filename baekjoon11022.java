package baekjoon;
import java.util.Scanner;

public class baekjoon11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int[] arr = new int[k];
		for(int a=0; a<k; a++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			arr[a] = b+c;
		}
		for(int r=0; r<k ; r++) {
			System.out.println("Case #"+ (r+1) +": "+ arr[r]);
		}
		sc.close();
	}

}
