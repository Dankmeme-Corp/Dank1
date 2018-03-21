package yolo.battle;

public class Archer extends Soldier{
	
	public Archer() {
		
	}
	
	public int attack() {
		
		
		this.stamina = this.stamina - 10;
		return 10;
	}

	public void block(int d) {
		if(this.stamina < 50) {
			this.health = this.health - d;
		}
		
	}

	
	@Override
	public void distanceFromEnemy(int distance) {
		// TODO Auto-generated method stub
		
	}
	
}
