package lecc_4;
import java.util.*;
public class sumof_naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int sum=0;
		int i=1;
		
		while(i<=n) {
			sum =sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}

}
