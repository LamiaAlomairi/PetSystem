package src;

public abstract class PetShow {
	
	public void judgeSound(Pet pet) {
        pet.makeSound();
        System.out.println("Sound judged.");
    }
    public void judgeMovement(Pet pet) {
        pet.move();
        System.out.println("Movement judged.");
    }
    public void judgeEatingHabits(Pet pet)
    {
        pet.eat();
        System.out.println("Eating habits judged.");
    }
	
}
