package yolo.battle;

import java.util.Random;

public class Swordman extends Unit {

	public Swordman(String name) {
		super();
		this.name = name;
	}

	public int attack(int distance) {	
		Random r = new Random();
		int Low = 10;
		int High = 100;
	
		
		if(distance < 3) {
			this.stamina = this.stamina - 50;
			return r.nextInt(High-Low) + Low;
		}
		else {
			return 0;
		}
	}

	public void block(int d) {	
		if(health-d<0){
			this.alive = false;
		}
		if(this.stamina < 10) {
			this.health = this.health - d;
		}
		
	}

	@Override
	public void distanceFromEnemy(int distance) {
		// TODO Auto-generated method stub
		
	}

}
