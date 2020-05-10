import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		
		double height = 0;
		
		for(;;) {
			System.out.println("Height:");
			height = n.nextDouble();
			
			if(height >= 100 && height < 200) {
				break;
			}
		}
		height = height/100;
		
		
		double weight = 0;
		
		for(;;) {
			System.out.println("Weight:");
			weight = n.nextDouble();
			
			if(weight >= 10 && weight < 200) {
				break;
			}
		}
		
		double bmi = weight/(height*height);
		
		System.out.print("Your BMI is "+bmi);
	}

}
