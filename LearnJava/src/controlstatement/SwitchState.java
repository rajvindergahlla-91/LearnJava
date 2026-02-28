package controlstatement;

public class SwitchState {
	public void printDaysOfWeek(String day) {
		String data= day.toLowerCase();
		switch (data) {
		case "sunday":
			System.out.println("today is sunday");
			break;
		case "monday":
			System.out.println("today is monday");
			break;
		case "tuesday":
			System.out.println("today is tuesday");
			break;
		case "wednesday":
			System.out.println("today is wednesday");
			break;
		case "thursday":
			System.out.println("today is thursday");
			break;
		case "friday":
			System.out.println("today is friday");
			break;
		case "saturday":
			System.out.println("today is saturday");
			break;

		default:
			System.out.println("no days");

		}
	}

	public static void main(String[] args) {
		String divas = "TUESDAY";
		 
		SwitchState ss = new SwitchState();
		ss.printDaysOfWeek(divas);
	}

}
