package src;

public class Cat extends Pet {
	
	@Override
	void makeSound() {
		 System.out.println("Meow");
	}
	
	@Override
	void move() {
		System.out.println("Cat is walking");
	}
	
	@Override
	void eat() {
		System.out.println("Cat is eating fish");
	}
	
}
