package javaBasics;

import java.util.Scanner;

public class ConditionConcept2 {

	public static void main(String[] args) {
		// Sprinkler app -> time setup (start time & end time, mode/intensity)
		String startTime,endTime,intensity,currentStartTime,currentEndTime;
		currentStartTime = "10";
		currentEndTime = "12";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time (24hrs format)");
		System.out.print("Start time: ");
		startTime = scan.nextLine();
		System.out.print("End time: ");
		endTime = scan.nextLine();
		System.out.print("Select mode(Low/Medium/High): ");
		intensity = scan.nextLine();
		
		if(!startTime.isBlank() && !endTime.isBlank() && !intensity.isBlank()) {
			if(startTime.equals(currentStartTime)) {
				System.out.println("Start Sprinkler.");
				System.out.println("Intensity selected: "+intensity);
				if(currentEndTime.equals(endTime)) {
					System.out.println("End Sprinkler.");	
				}
			}else if(!startTime.equals(currentStartTime)) {
				System.out.println("Either Sprinkler action completed or will start soon.");
			}
		}else {
			System.err.println("Some invalid inputs. Try again!");
			System.out.print("Start time: ");
			startTime = scan.nextLine();
			System.out.print("End time: ");
			endTime = scan.nextLine();
			System.out.print("Select mode(Low/Medium/High): ");
			intensity = scan.nextLine();
			scan.close();
			if(!startTime.isBlank() && !endTime.isBlank() && !intensity.isBlank()) {
				if(startTime.equals(currentStartTime)) {
					System.out.println("Start Sprinkler.");
					System.out.println("Intensity selected: "+intensity);
					if(currentEndTime.equals(endTime)) {
						System.out.println("End Sprinkler.");	
					}
				}else if(!startTime.equals(currentStartTime)) {
					System.out.println("Either Sprinkler action completed or will start start soon.");
				}
			}else {
				System.err.println("Something went wrong. Try again later!");
			}
		}
	}

}
