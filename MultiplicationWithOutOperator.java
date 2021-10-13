import java.util.Scanner;

public class MultiplicationWithOutOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stubsy
System.out.println("enter the multiplication table number");
Scanner sc =new Scanner(System.in);
int mul=sc.nextInt();
int sum=0;
for(int i=1;i<=20;i++)
{

		sum=sum+mul;
		
	
	System.out.println(sum);
}

	}

}

