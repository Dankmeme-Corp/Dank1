package yolo.battle;

public class Archer extends Unit implements Soldier{
	
	public Archer() {
		
	}
	
	public int attack() {
		// TODO Auto-generated method stub
		this.stamina = this.stamina - 10;
		return 0 + (int)(Math.random() * ((this.stamina - 0) + 1));
	}

	public void block(int d) {
		if(this.stamina < 50) {
			this.health = this.health - d;
		}
		
	}
	
}
