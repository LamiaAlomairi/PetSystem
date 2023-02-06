package src;

public class Bird extends Pet {
	
	@Override
	void makeSound() {
		 System.out.println("Chirp");
	}
	
	@Override
	void move() {
		System.out.println("Bird is flying");
	}
	
	@Override
	void eat() {
		System.out.println("Bird is eating seeds");
	}
	
}
