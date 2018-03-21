package yolo.battle;

import java.util.Map;

public class Eval {

	public Eval(Map a, Map b){
		
		
		((Soldier)b.get("0")).block(((Soldier) a.get("0")).attack());
		System.out.println(((Unit)b.get("0")).health);
	}
	
	
	
	
}
