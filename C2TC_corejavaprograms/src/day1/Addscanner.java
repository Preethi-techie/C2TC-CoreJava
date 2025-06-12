package day1;
import java.util.Scanner;
public class Addscanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("Addition of : " +c);

	}

}
