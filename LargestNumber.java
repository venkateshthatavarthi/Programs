import java.util.Scanner;

public class LargestNumber {
	  public static void main(String[] args) 
	 {
	  int[] a=new int[5];
	  System.out.println("Enter the below numbers");
	  for(int i=0;i<5;i++)
	 {
	  System.out.println("enter the "+(i+1)+" Number");
	  a[i]=new Scanner(System.in).nextInt();
	 }
	  int largestNumber=(a[0]>a[1]&&a[0]>a[2]&&a[0]>a[3]&&a[0]>a[4]?a[0]:a[1]>a[2]&&a[1]>a[3]&&a[1]>a[4]?a[1]:a[2]>a[3]&&a[2]>a[4]?a[2]:a[3]>a[4]?a[3]:a[4]);
	  System.out.println("largest digit amoung five numbers is :"+largestNumber);
	 }
	 }


