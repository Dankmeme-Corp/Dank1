package yolo.battle;

public class Archer extends Soldier{
	
	public Archer() {
		
	}
	
	public int attack() {
		// TODO Auto-generated method stub
		this.stamina = this.stamina - 10;
		return 10;
	}

	public void block(int d) {
		if(this.stamina < 50) {
			this.health = this.health - d;
		}
		
	}
	
}
