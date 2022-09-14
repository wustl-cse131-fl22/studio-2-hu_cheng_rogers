package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// startAmount
		System.out.print("Initial amount of money: ");
		int startAmount = scanner.nextInt();
		
		// winChance
		System.out.print("Win chance: ");
		double winChance = scanner.nextDouble();
		
		// winLimit
		System.out.print("Win Limit: ");
		int winLimit = scanner.nextInt();
		
		// total simulation
		System.out.print("Times of simulation: ");
		int totalSimulations = scanner.nextInt();
		
		// final result printed 
		String result = "\n";
		
		// amount of rounds took to win or lose
		int round = 0;
		int wins = 0;
		int losses = 0;
		
		
		for (int day=1;day<totalSimulations+1;day++) {
			int start = startAmount;
			result += "Simulation " + day + ": ";
			round = 0;
			
			while (start > 0 && start < winLimit) {
				// amount of rounds took to win or lose
				
				double random = Math.random();
	
				// generate a random number to determine win or lose
				if (random < winChance) {
					start++;
				} else {
					start--;
				} // end if
				
				round++;
				
				
			} // end while
			
			if (start == 0) {
				losses++;
				result += round + " LOSE\n";
				//System.out.println("\n\nRuin!");
			} else {
				wins++;
				result += round + " WIN\n";
	
				//System.out.println("\n\nSuccess!");
			} // end if
			
		} // end for
		
		
			
		result += "\nLosses: " + losses + "\t Simulations: " + totalSimulations;
		result += "\nRuin Rate from Simulation: " + (losses / totalSimulations);
		
		System.out.print(result);
	}

}
