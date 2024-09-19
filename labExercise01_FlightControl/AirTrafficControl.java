/**
 * 
 */
package labExercise01_FlightControl;

/**
 * Test driver for Flight class
 */
public class AirTrafficControl {

	/**
	 * @author David O'Hanlon
	 */
	public static void main(String[] args) {

		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newwark", 8.5);
		
		// Output all flights to screen
		
		System.out.println("All flight info :");
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3);
		System.out.println(f4);
		
		// Creating array
		
		Flight[] flights = new Flight[] {f1, f2, f3, f4};
		
		System.out.println();
		
		// Accessing single flight number
		
		System.out.println("Accessing single flight number :");
		System.out.println(flights[0].getFlightNumber());
		System.out.println();
		
		// Outputting all flights using a loop
		
		System.out.println("Outputting all flights using a loop");
		System.out.println();
		
		for (int i = 0; i < flights.length; i++) {
			System.out.println(flights[i].toString());
		}
		
		// Search for flight with longest duration
		
		double longestduration = flights[0].getDuration();
		
		for (int i = 0; i < flights.length; i++) {
			if (flights[i].getDuration() > longestduration) {
				longestduration = flights[i].getDuration();
			} else {
				continue;
			}
		}
		
		System.out.println();
		System.out.println("Longest duration flight is " + longestduration);
		
		// Search all flights to Dublin and out flight numbers
		
		System.out.println("Flight numbers for flights Dublin bound :");
		System.out.println();
		
		for (int i = 0; i < flights.length; i++) {
			if (flights[i].getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(flights[i].getFlightNumber());
			} else {
				continue;
			}
		}
		
		// Testing duration business rules
		
		System.out.println();
		System.out.println("Testing business rules :");
		
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);

		System.out.println();
		System.out.println("Flight details - duration should default to zero :");
		
		System.out.println(f5.toString());
		
		
		
	}

}
