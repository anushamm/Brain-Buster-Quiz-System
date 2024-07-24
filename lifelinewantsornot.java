package Quizproject;
import java.util.Scanner;
public class lifelinewantsornot {
	private Scanner scanner = new Scanner(System.in);

	public int askForLifeline() 
	{
		System.out.println("If you want to take a lifeline, press 1 for 50-50, 2 for Audience, 3 for Phone Call A friend, or any other key to skip:");
		int choice = scanner.nextInt();
		return (choice >= 1 && choice <= 3) ? choice:-1;
	}
}
