package baekjoon;
import java.util.Scanner;
public class baekjoon10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int X = sc.nextInt();
		
		for(int i=0; i<N ; i++) {
			int a = sc.nextInt();
			
			arr[i] = a;
			if(arr[i]<X) {
				System.out.print(arr[i] + " ");
				}
			}
		sc.close();
		}
		
	}

