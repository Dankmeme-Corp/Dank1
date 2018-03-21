package yolo.battle;

public class Swordman extends Unit {

	public Swordman() {
		super();
	}

	public int attack() {
		// TODO Auto-generated method stub
		this.stamina = this.stamina - 10;
		
		return 0 + (int)(Math.random() * ((this.stamina - 0) + 1));
	}

	public void block(int d) {
		if(this.stamina > 10) {
			this.health = this.health - d;
		}
		
	}

}
