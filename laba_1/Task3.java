import java.time.LocalDate;

public class Task3 {
	public static void main(String[]args) {
		int variant=7;
		LocalDate now = LocalDate.now();
		int day  = now.getDayOfMonth();
		for(int i =0; i<variant+3; i++){
			int sum = variant+day;
			System.out.println(sum);
		}
	}
}
