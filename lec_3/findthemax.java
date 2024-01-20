package lec_3;
import java.util.*;
public class findthemax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is maximum");
		}else if(b>c){
			System.out.println("b is maximum");
		}else {
			System.out.println("c is maximum");
		}
		
		
		
	}

}
