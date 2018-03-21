package yolo.battle;

public class Swordman extends Soldier {

	public Swordman() {
		
	}

	public int attack() {
		// TODO Auto-generated method stub
		this.stamina = this.stamina - 10;
		return this.stamina;
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
