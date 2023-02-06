package src;

public class Pet {
	//having the behavior of making sound, moving and eating
	//every pet has a name attrbute
	
	String nameOfPet;
	
	public void setNameOfPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
	}
	public String getNameOfPet() {
		return nameOfPet;
		
	}
	
	 void makeSound() {
		 System.out.println("Pet is making a sound");
	}
	
	void move() {
		System.out.println("Pet is moving");
	}
	
	void eat() {
		System.out.println("Pet is eating");
	}
	
	
}
