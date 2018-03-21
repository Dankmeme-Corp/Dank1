package yolo.battle;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Unit ua;
		Unit ub;
		 
		ua = new Archer("Archer");
		ub = new Swordman("Sworder");
		
		new Eval(ua, ub);
		
		ua = new Archer("Archer");
		ub = new Swordman("Sworder");
		
		new Eval(ub, ua);
	}

}
