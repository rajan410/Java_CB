package lecc_4;
import java.util.*;
public class grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int marks=s.nextInt();
		
		if(marks>90) {
			System.out.println("grade is 0");
		}else if(marks>80 && marks<=90) {
			System.out.println("grade is A+");		
		}else if(marks>70 && marks<=80) {
			System.out.println("grade is A");
		}else if(marks>60 && marks<=70) {
			System.out.println("grade is P");
		}else {
			System.out.println("grade is F");
		}
	}

}
