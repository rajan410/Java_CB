package lec_5;
import java.util.*;
public class pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=n;//no of stars in row
		while(row<=n) {
			//work
			//print the star
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i=i+1;
				
			}
			//preparation for next row
			
			nst=nst-1;
			
			System.out.println();
			row=row+1;
		}
	}

}
