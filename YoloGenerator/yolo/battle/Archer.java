package yolo.battle;

public class Archer extends Unit {
	
	public Archer() {
		super();
	}
	
	public int attack() {
		// TODO Auto-generated method stub
		this.stamina = this.stamina - 10;
		return (int)(Math.random() * ((this.stamina - 0 + 1) + 0));
	}
	
	public void block(int d) {
		if(this.stamina > 10) {
			this.health = this.health - d;
		}
		
	}
	
}
