package baekjoon;
import java.util.Scanner;
public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int t = a;
		int cnt = 0;
		
		while(true) {
			//여기 부분 괄호 잘 쓰기
			a = ((a%10)*10) + (((a/10)+(a%10))%10);
			
			cnt++;
			if(t==a) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
