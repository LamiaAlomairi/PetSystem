package src;
import java.util.*;

public class DogShow extends PetShow{
	Scanner scan = new Scanner(System.in);
	int soundJudges =0;
	int moveJudges=0;
	int eatingJudges=0;
	 @Override
	    public void judgeSound(Pet pet) {
	        super.judgeSound(pet);
	        try {
	        	boolean check = true;
	        	while(check) {
	        		System.out.print("Your sound judged (0-10): ");
	    	        int soundJudge = scan.nextInt();
	        		if(soundJudge>=0 && soundJudge<=10) {
	        			soundJudges = soundJudges +soundJudge;
	        			check = false;
	        		}
	        		else {
	        			System.out.println("Wrong number The judged should be from 0 to 10 ");
	        		}
	        	}
	        }
	        catch(Exception e) {
	        	
	        }
	    }
	    @Override
	    public void judgeMovement(Pet pet) {
	        super.judgeMovement(pet);
	        try {
	        	boolean check = true;
	        	while(check) {
	        		System.out.print("Your movement judged (0-10): ");
	    	        int moveJudge = scan.nextInt();
	        		if(moveJudge>=0 && moveJudge<=10) {
	        			moveJudges = moveJudges +moveJudge;
	        			check = false;
	        		}
	        		else {
	        			System.out.println("Wrong number The judged should be from 0 to 10 ");
	        		}
	        	}
	        }
	        catch(Exception e) {
	        	
	        }
	    }
	    
	    public void judgeEatingHabits(Pet pet)
	    {
	    	super.judgeEatingHabits(pet);
	        try {
	        	boolean check = true;
	        	while(check) {
	        		System.out.print("Your eating judged (0-10): ");
	    	        int eatingJudge = scan.nextInt();
	        		if(eatingJudge>=0 && eatingJudge<=10) {
	        			eatingJudges = eatingJudges +eatingJudge;
	        			check = false;
	        		}
	        		else {
	        			System.out.println("Wrong number The judged should be from 0 to 10 ");
	        		}
	        	}
	        }
	        catch(Exception e) {
	        	
	        }
	    }
	
}
