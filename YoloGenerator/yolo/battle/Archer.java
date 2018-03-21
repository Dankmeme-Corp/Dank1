package yolo.battle;

import java.util.Random;

public class Archer extends Unit {
	
	public Archer(String name) {
		super();
		this.name = name;
	}
	
	public int attack(int distance) {
		Random r = new Random();
		int Low = 10;
		int High = 100;
		
		this.stamina = this.stamina - 10;
		return r.nextInt((High-distance*2)-Low) + Low;
	}
	
	public void block(int d) {
		if(this.stamina > 10) {
			this.health = this.health - d;
		}
		
	}

	
	@Override
	public void distanceFromEnemy(int distance) {
		// TODO Auto-generated method stub
		
	}
	
}
