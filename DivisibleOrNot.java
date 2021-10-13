import java.util.Scanner;

public class DivisibleOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the divisor");
int divd=sc.nextInt();
System.out.println("enter the divident");

int divs=sc.nextInt();
if(divd%divs==0)
	System.out.println(divd+" is divisible by "+ divs);
else
	System.out.println(divd+" is not divisible by "+ divs);

	
	}

}


