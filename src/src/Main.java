package src;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pet> petList = new ArrayList<Pet>();
		//petList.add(new Cat("Cat"));
		/*Class[] classes = new Class[] {
	            Cat.class,
	            Dog.class,
	            Horse.class,
	            Bird.class,
	            RobotPet.class
	        };
		String[] classNames = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
        	System.out.println(classNames[i] = classes[i].getName());
        }
        */
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		Horse horse = new Horse();
		RobotPet robotPet = new RobotPet();
		
		
		cat.setNameOfPet("Cat");
		System.out.println("Cat Details");
		System.out.println("-----------");
		System.out.println("Pet Name: " + cat.getNameOfPet());
		System.out.print(cat.getNameOfPet() + " Sound: ");   cat.makeSound();
		cat.move();
		cat.eat();
		System.out.println("_________________________");
		System.out.println();
		
		dog.setNameOfPet("Dog");
		System.out.println("Dog Details");
		System.out.println("-----------");
		System.out.println("Pet Name: " + dog.getNameOfPet());
		dog.makeSound();
		dog.move();
		dog.eat();
		System.out.println("_________________________");
		System.out.println();
		
		
		bird.setNameOfPet("Bird");
		System.out.println("Bird Details");
		System.out.println("------------");
		System.out.println("Pet Name: " + bird.getNameOfPet());
		System.out.print(bird.getNameOfPet() + " Sound: ");   bird.makeSound();
		bird.move();
		bird.eat();
		System.out.println("_________________________");
		System.out.println();
		
		horse.setNameOfPet("Horse");
		System.out.println("Horse Details");
		System.out.println("-------------");
		System.out.println("Pet Name: " + horse.getNameOfPet());
		System.out.print(horse.getNameOfPet() + " Sound: ");   horse.makeSound();
		horse.move();
		horse.eat();
		System.out.println("_________________________");
		System.out.println();
		
		robotPet.setNameOfPet("RobotPet");
		System.out.println("Robot Pet Details");
		System.out.println("-----------------");
		System.out.println("Pet Name: " + robotPet.getNameOfPet());
		System.out.print(robotPet.getNameOfPet() + " Sound: ");   robotPet.makeSound();
		robotPet.move();
		robotPet.eat();
		System.out.println("_________________________");
		System.out.println();
		
		petList.add(cat);
		petList.add(dog);
		petList.add(bird);
		petList.add(horse);
		petList.add(robotPet);
		for(int i=0; i<petList.size(); i++) {
			System.out.println(petList.get(i).nameOfPet);
		}
		System.out.println("_________________________");
		
		DogShow dogShow = new DogShow();
		dogShow.judgeSound(dog);
		System.out.println("_________________________");
		dogShow.judgeMovement(dog);
		System.out.println("_________________________");
		dogShow.judgeEatingHabits(dog);
		
		

	}

}
