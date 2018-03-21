package yolo.battle;

public class Eval {

	private int distance;
	
	public Eval(Unit a, Unit b){
		
		distance = 10;
		
		while(b.alive && a.alive) {

			System.out.println();
			System.out.println(a.name + ", health: " + a.health);
			System.out.println(b.name + ", health: " + b.health);
			System.out.println("Distance" + distance);
			
			b.block(a.attack(distance));
			a.block(b.attack(distance));
			
			if(b.health <= 0){
				b.killUnit();
				System.out.println("Ded");
				System.out.println("A winner is: " + a.name);
				System.out.println("Health: " + a.health);
			}
			
			if(a.health <= 0){
				a.killUnit();
				System.out.println("Ded");
				System.out.println("A winner is: " + b.name);
				System.out.println("Health: " + b.health);
			}
			if(distance>0) {
				distance = distance - 1;
			}
		}
	}
	
	
	
	
}
