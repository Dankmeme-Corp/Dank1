package yolo.battle;


public abstract class Unit implements Soldier {

	protected boolean alive = false;
	protected int weight = 0;

	protected int health = 100;
	protected int stamina = 100;
	protected String name;
	
	
	
	Location location = new Location();

	//  X = _
	
	//  Y = |
	
	
	
	
	public Unit() {
		alive = true;
	}
	
	
/*	
 * private int agililty;
	private int strength;
	private int intelligence;
	private int charisma;
	*/
	
}
