package src;

public class Dog extends Pet {
	
	@Override
	void makeSound() {
		 System.out.println("Dog sound is Bark");
	}
	
	@Override
	void move() {
		System.out.println("Dog is running");
	}
	
	@Override
	void eat() {
		System.out.println("Dog is eating bones");
	}
	
}
