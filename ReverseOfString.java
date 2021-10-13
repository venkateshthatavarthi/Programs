
public class ReverseOfString {
	public static void main(String[] args) {
		String s1="venkateshthatavarthi";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			  s2=s2+s1.charAt(i);

		}
		// TODO Auto-generated method stub
		System.out.println("original string is : "+s1);
System.out.println("reversed string is : "  +s2);
	}



}
