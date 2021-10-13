import java.util.Scanner;

public class SeasonName {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the month name");
		String monthName=sc.next();
		if("jan".equals(monthName)||"feb".equals(monthName)||"dec".equals(monthName))
		
			System.out.println("your month is in winter season");
		else	if("june".equals(monthName)||"july".equals(monthName)||"aug".equals(monthName))
			
			System.out.println("your month is in rainy season");
		else if("sep".equals(monthName)||"oct".equals(monthName)||"nov".equals(monthName))
			
			System.out.println("your month is in spring season");
		else
			
			System.out.println("your month is in summer season");
		switch(monthName) {
		case ("mar"):System.out.println("winter");
		break;
		
		}
		}
}