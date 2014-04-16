package model;

public enum Effect {
	poison, paralyze, sleep, burn, freeze, confuse;
	
	public void getStatuseffect(Effect status, double speed, int DoT, int length){
		if(status == poison){
			speed = 0.75;
			DoT = 5;
			length = 10000000;
		}
		if(status == paralyze){
			speed = 0;
			DoT = 2;
			length = 2;
		}
		if(status == sleep){
			speed = 0;
			DoT = 0;
			length = 5;
		}
		if(status == burn){
			speed = 2;
			DoT = 15;
			length = 5;
		}
		if(status == freeze){
			speed = 0.25;
			DoT = 2;
			length = 5;
		}
		if(status == confuse){
			speed = -1;
			DoT = 0;
			length = 2;
		}
	}
}