package baekjoon;
import java.util.Scanner;
public class baekjoon9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if((a>=90)&&(100>=a)) {
			System.out.println("A");
		}else if((a>=80)&&(89>=a)){
			System.out.println("B");
		}else if((a>=70)&&(79>=a)){
			System.out.println("C");
		}else if((a>=60)&&(69>=a)){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
