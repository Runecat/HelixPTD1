package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Weezing extends Mob{

	public Weezing(BufferedImage[] b) {
		super(b);
		super.name = "Weezing";
		super.health = 80;
		super.moveSpeed = 5;
		super.type = Type.POISON;
		super.money = 11;	
	}
}
