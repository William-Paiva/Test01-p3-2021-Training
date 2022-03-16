package classes;

public class Engine {
	
	double torque;
	int potency;
	
	
	public double getTorque() {
		return torque;
	}
	public void setTorque(double torque) {
		this.torque = torque;
	}
	public int getPotencia() {
		return potency;
	}
	public void setPotencia(int potency) {
		this.potency = potency;
	}
	
	
	@Override
	public String toString() {
		return "\n\tTorque: " + torque + "\n\tPotency: " + potency;
	}
}
