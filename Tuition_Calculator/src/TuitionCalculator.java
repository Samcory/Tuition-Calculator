import java.util.Scanner;

public class TuitionCalculator {

	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("Tuition Calculator Initiated"); 
		System.out.println("");
		System.out.println("Please follow the prompt and your cost of tuition will be generated.");
		
		System.out.println("How much is tuition initially for your four year degree? ");
		double tuitionYear1 = input.nextDouble();
		System.out.println("How much is the percentage increase of tuition based on university costs "
				+ "(Enter as decimal with no percent sign" + " i.e. 0.15? ");
		double percentIncrease = input.nextDouble();
		
		double tuition = tuitionYear1;
		for(int i=1; i<4; i++){
			tuition += tuition*percentIncrease;
		}
		System.out.println("The cost of tuition for your four year degree will be $" + tuition);
	}
}