package yolo.battle;

import java.util.Random;

public class Eval {

	private int distance;
	
	public Eval(Unit a, Unit b){
		
		distance = 10;
		
		while(a.alive && b.alive) {

			int select = (Math.random() <= 0.5) ? 1 : 2;;
			System.out.println(select);
			if(select==1) {
				a.block(b.attack(distance));
			}
			
			else if(select==2) {
				b.block(a.attack(distance));
			}
			
			if(a.health < 0 || b.health < 0) {
				break;
			}
			
			if(distance>0) {
				distance = distance - 1;
			}
		}
		
		System.out.println(b.name + " Ded");
		System.out.println("A winner is: " + a.name);
		System.out.println("Health: " + a.health);

		System.out.println(a.name + "Ded");
		System.out.println("A winner is: " + b.name);
		System.out.println("Health: " + b.health);
	}
	
	
	
	
}
