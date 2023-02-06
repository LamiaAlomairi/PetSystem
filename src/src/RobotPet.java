package src;

public class RobotPet extends Pet {
	
	@Override
	void makeSound() {
		 System.out.println("Beep");
	}
	
	@Override
	void move() {
		System.out.println("Robot Pet is rolling");
	}
	
	@Override
	void eat() {
		System.out.println("Robot Pet is charging");
	}
	
}
