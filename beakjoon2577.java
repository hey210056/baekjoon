package baekjoon;
import java.util.Scanner;
public class beakjoon2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = (a*b*c);
		
		String v = Integer.toString(d);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<v.length(); j++) {
				 if((v.charAt(j) - '0') == i) {
					 count ++;
				 } 
			}
			System.out.println(count);
		}
		
	}

}
