
package Day1;
import java.util.Scanner;
public class Addition {
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int  a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println("Addition of a=" +a+ " &b="+b+ " is"+c);
    }
}
