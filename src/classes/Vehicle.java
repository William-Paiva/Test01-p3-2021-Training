package classes;

public class Vehicle {
	String color;
	int yearFab;
	int yearModel;
	Engine engine;
	int currentSpeed;
						
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYearFab() {
		return yearFab;
	}
	public void setYearFab(int yearFab) {
		this.yearFab = yearFab;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public void speedUp(int speedUp) {
		currentSpeed += speedUp;
	}		
	public void toBreak(int toBreak) {
		currentSpeed -= toBreak;
	}
	@Override
	public String toString() {
		return "\n\tColor: " + color + "\n\tYear of Fabricaton: " + yearFab + "\n\tYear of Model: " + yearModel + "\n\tCurrent Speed: " + currentSpeed + "\nEngine" + engine;
	}
}
