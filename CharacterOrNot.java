import java.util.Scanner;

public class CharacterOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a character");
	char ch=new Scanner(System.in).next(). charAt(0);
	String alphabet=((ch>='A'&&ch<='z')||(ch>='a'&&ch<='z'))?"Special character":"not a special Character";
	System.out.println(alphabet);

	}

}


