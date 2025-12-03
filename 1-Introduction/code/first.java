import java.lang.*;
import java.util.Scanner;
class first{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter values:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int sum=a+b+c;
		System.out.println("Sum is : "+sum);
		System.out.printf("Sum is %d",sum);
		s.nextLine();
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println(name);
}
}