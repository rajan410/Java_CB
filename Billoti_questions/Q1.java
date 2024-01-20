package Billoti_questions;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=4) {
			int j=1;
			while(j<=4) {
				if(i<=j) {
					System.out.print("*");
				}
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}

}
