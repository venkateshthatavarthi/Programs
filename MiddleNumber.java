import java.util.Scanner;

public class MiddleNumber {
	public static void main(String[] args)  
	{

		Scanner sc =new Scanner(System.in);
System.out.println("Enter the first Number");

int a=sc.nextInt();
System.out.println("Enter the second Number");
int b=sc.nextInt();
System.out.println("Enter the third Number");
int c=sc.nextInt();


int middleNumber=(a>b&&a<c||a<b&&a>c?a:b>a&&b<c||b<a&&b>c?b:c>a&&c<b||c<a&&c>b?c:a);
System.out.println("Middle Number is :"+middleNumber);

	}



}
