package yolo.battle;

public class Test {

	public static void main(String[] args) {
		Unit ua;
		Unit ub;
		
		ua = new Archer();
		ub = new Swordman();
		System.out.print(ub.health);
		((Swordman) ub).block(((Archer) ua).attack());;
		System.out.print(ub.health);
	}

}
