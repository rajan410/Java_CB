package lecc_4;
import java.util.*;
public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		while(row<=5) {
			int i=1;
			while(i<=n) {
				System.out.print("*");
				i=i+1;
			}
			System.out.println();
			row=row+1;
		}
	}

}
