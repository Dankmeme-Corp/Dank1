package yolo.battle;

import java.util.Random;

public class Damage {
	
	protected int hitDamage;
	protected double hitChancePercentage;
	
	
	public double hitChance() {
		
		Random number = new Random();
		
		number.doubles();
		
		
		return hitChancePercentage;
	}
	
}
