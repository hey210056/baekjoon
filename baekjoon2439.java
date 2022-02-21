package baekjoon;
import java.util.Scanner;
public class baekjoon2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=a; i++) {
			for(int k=a; k>0; k--) {
				if(i<k) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}
