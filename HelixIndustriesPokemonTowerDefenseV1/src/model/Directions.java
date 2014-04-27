package model;

public enum Directions {

	Up(0), Right(1), Down(2), Left(3);
	
	public int getValue() {
	    return value;
    }
	
	private int value;

    Directions(int val) {
    	value = val;
    }
	
}
