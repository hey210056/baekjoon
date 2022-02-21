package baekjoon;
import java.util.Scanner;
public class baekjoon10818 {
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			int t = sc.nextInt();
			arr[i]=t;
		}
		int min = arr[0];
		int max = arr[0];
		
		for(int s : arr) {
			if(s<min)
				min = s;
			if(s>max)
				max = s;
		}
		System.out.println(min);
		System.out.println(max);
			sc.close();
	}
}
