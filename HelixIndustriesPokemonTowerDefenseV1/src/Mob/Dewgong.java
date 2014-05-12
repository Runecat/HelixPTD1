package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Dewgong extends Mob{

	public Dewgong(BufferedImage[] b) {
		super(b);
		super.name = "Dewgong";
		super.health = 200;
		super.moveSpeed = 6;
		super.type = Type.ICE;
		super.money = 0;	
	}
}
