package src;

public class Horse extends Pet {
	
	@Override
	void makeSound() {
		 System.out.println("Neigh");
	}
	
	@Override
	void move() {
		System.out.println("Horse is trotting");
	}
	
	@Override
	void eat() {
		System.out.println("Horse is eating hay");
	}
	
}
