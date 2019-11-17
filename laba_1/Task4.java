import java.util.Scanner;

public class Task4 {
	public static void main(String[]args) {
		double num;
		do{
			Scanner in = new Scanner(System.in);
			System.out.print("Input a number from 2 to 5: ");
			num = in.nextDouble();
		}while(num<2||num>5);
		String msg = "Duke Nukem must die!";
		num*=msg.length();
		if(num>30){
			num/=2;
		}
		System.out.println(num);
	}
}
