package classes;

public class Challenger {
	String nickName;
	Vehicle vehicle;
	
	public String getNickname() {
		return nickName;
	}
	public void setNickname(String apelido) {
		this.nickName = apelido;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "\nChallenger: " + nickName + "\n" + "\nVehicle: "+vehicle ;
	}
}
