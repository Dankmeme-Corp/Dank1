package yolo.battle;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Unit ua;
		Unit ub;
		 
		ua = new Archer();
		ub = new Swordman();
		//System.out.print(ub.health);
		((Swordman) ub).block(((Archer) ua).attack());;
		//System.out.print(ub.health);
		
		Map a = new HashMap();
		Map b = new HashMap();
		
		a.put("0", ua);		
		b.put("0", ub);
		
		new Eval(a, b);
	
		double tal = Math.floor(Math.random() * 100);
		
		System.out.println(tal);
		Location l = new Location();
		
		
		l.getLocationSoldierX(1);
		System.out.println(l.getCurrentSoldierXLocation());
		System.out.println("Moving in X: ");
		l.moveX(1);
		System.out.println(l.getCurrentSoldierXLocation());
		//ub.moveX(1);
		//System.out.println("X cords: " + playerX + " | " + "Y cords: " + playerY);
	}

}
