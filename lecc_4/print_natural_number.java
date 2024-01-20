package lecc_4;

import java.util.*;

public class print_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		// ith natural number. i=1 means 1st natural number ki baat ho rhu h
		while (i <= n) {
			System.out.println(i);
			i = i + 1;
		}
	}

}
