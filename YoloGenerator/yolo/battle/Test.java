package yolo.battle;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Unit ua;
		Unit ub;
		 
		ua = new Archer();
		ub = new Swordman();
		System.out.print(ub.health);
		((Swordman) ub).block(((Archer) ua).attack());;
		System.out.print(ub.health);
		
		Map a = new HashMap();
		Map b = new HashMap();
		
		a.put("0", ua);		
		b.put("0", ub);
		
		new Eval(a, b);
		
	}

}
