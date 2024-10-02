public class This {

	private int currentFuelLevel = 3; // instance variable

	public void decreaseFuelLevel() {
		int currentFuelLevel = 10; // local variable with the same name
		currentFuelLevel--; // this refers to the local variable, not the instance variable
		System.out.println("Local variable currentFuelLevel: " + currentFuelLevel);
		System.out.println("Instance variable currentFuelLevel: " + this.currentFuelLevel);
	}
}
