package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import classes.Car;
import classes.Challenger;
import classes.Motorcycle;
import classes.Engine;

public class StartApp {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Challenger> challengers = new ArrayList<>();
	
	
	public void start() {
		
		cadastroCompetidor();
		race();						
	}
	
	public void race() {		
		Random random = new Random();	
		
		for (int i = 0; i < 10; i++) {
			challengers.forEach((corredor) -> corredor.getVehicle().speedUp(random.nextInt(5,21)));
			}
		
		Challenger first = challengers.get(0);
		
		for(int i=0; i<challengers.size(); i++) {
			if(challengers.get(i).getVehicle().getCurrentSpeed() > first.getVehicle().getCurrentSpeed()) {
				first = challengers.get(i);
			}
		}		
			System.out.println("\nAND THE WINNER IS... ");	
			System.out.println(first);
		}								
								
	public void cadastroCompetidor() {
		
		int count = 0;
		
		while(count <5) {
			Challenger challenger =  new Challenger();
			
			System.out.println("\n=== Challengers Registration! ===\n");		
			System.out.println("Enter the challenge's nickname: ");
			challenger.setNickname(scanner.nextLine());		
			System.out.println("Now, choose a vehicle:\n1. Car\n2. Motorcycle\n");
		
			int option = scanner.nextInt();
			scanner.nextLine();
		
			if(option == 1) {
				Car car = new Car();
				Engine engine = new Engine();
				System.out.println("Enter the car's color: ");
				car.setColor(scanner.nextLine());
				System.out.println("Enter the car's year of fabrication: ");
				car.setYearFab(scanner.nextInt());
				System.out.println("Enter the car's year of model: ");
				car.setYearModel(scanner.nextInt());					
				System.out.println("Enter the engine's torque:  ");
				engine.setTorque(scanner.nextDouble());
				System.out.println("Enter the engine's potency:  ");
				engine.setPotencia(scanner.nextInt());
				car.setEngine(engine);
				challenger.setVehicle(car);
			
			}else if(option == 2) {
				Motorcycle motorcycle = new Motorcycle();
				Engine engine = new Engine();				
				System.out.println("Enter the motorcycle's color: ");
				motorcycle.setColor(scanner.nextLine());
				System.out.println("Enter the motorcycle's year of fabrication: ");
				motorcycle.setYearFab(scanner.nextInt());
				System.out.println("Enter the motorcycle's year of model: ");
				motorcycle.setYearModel(scanner.nextInt());					
				System.out.println("Enter the engine's torque:  ");
				engine.setTorque(scanner.nextDouble());
				System.out.println("Enter the engine's potency:  ");
				engine.setPotencia(scanner.nextInt());
				motorcycle.setEngine(engine);
				challenger.setVehicle(motorcycle);
			}
				scanner.nextLine();
				challengers.add(challenger);	
				count++;				
		}
	}				
}
