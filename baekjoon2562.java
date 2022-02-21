package baekjoon;
import java.util.Scanner;
public class baekjoon2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int index = 0;
		int cnt = 0;
		for(int s : arr) {
			
			cnt++;
			if(max<s) {
				max = s;
				index = cnt;
			}
		}
		
		System.out.println(max+ "\n" +index);
		//System.out.println(Arrays.asList(arr).indexOf(max));
	}

}
