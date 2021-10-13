/*wap to check whether a given number is even or not*/
import java.util.Scanner;

        public class EvenOrOdd {
	    public static void main(String[] args) {
		System.out.println("enter the number");
		int number=new Scanner(System.in).nextInt();
		String s=(number%2==0)?"even":"odd";
		System.out.println("given number "+number+"  is "+s);
	}
}
	



