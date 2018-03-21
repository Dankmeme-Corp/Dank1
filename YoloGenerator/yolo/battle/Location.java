package yolo.battle;

public class Location {
	
	
	
	private int mapSize = 100;
	private double x;
	private double y;
	
	

	double getLocationSoldierX(double x){

		for(int i = 0; i < 1; i++) {
			this.x = Math.floor(Math.random() * mapSize);
			x = this.x;
		}

		
		
		return x;
	
	
	}
	double getCurrentSoldierXLocation() {
		
		return this.x;
		
	}

	double getLocationSoldierY(double y) {

		for(int i = 0; i < 1; i++) {
			this.y = Math.floor(Math.random() * mapSize);
			y = this.y;
		}

		return y;
}
	
public void moveX(double x) {

		if( x < 0) {
			
	
			this.x += x;
			
		}
		else if(x > 0) {
			
			this.x += x;
		
		}
		
	}
	
	
	public void moveY(double y) {

		if( y < 0) {
			
			this.y += y;
			
		}
		else if(y > 0) {
			
			this.y += y;
		
		}
		
		
	}
	
}